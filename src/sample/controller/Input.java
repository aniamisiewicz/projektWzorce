package sample.controller;

import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import sample.model.*;

import java.net.URL;
import java.util.ResourceBundle;

public class Input extends AppController {
    public Label question;
    public TextField inputField;
    public Label alert;
    private QuestionWithInput currentQuestion;
    private final IIterator iterator = questions.createIterator();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        displayQuestion();
    }

    private void updateQuestion() {
        currentQuestion = (QuestionWithInput) iterator.next();
        alert.setText("");
    }

    public void displayQuestion(){
        setInputField();
        updateQuestion();
        question.setText(currentQuestion.getContent());
    }

    public void answerQuestion(){
        if(anyInput()){
            if(currentQuestion.state instanceof NonAnsweredState) {
                currentQuestion.clickAnswer(alert);
                setSelectedAnswer();
                checkAnswer();
            }
            else if(currentQuestion.state instanceof AnsweredState){
               currentQuestion.clickAnswer(alert);
            }
        }
        else{
            alert.setText("Musisz odpowiedzieć najpierw.");
        }
    }

    public boolean anyInput(){
        return !inputField.getText().equals("");
    }

    private void setSelectedAnswer(){
        currentQuestion.userAnswer = inputField.getText();
    }

    private void checkAnswer(){
        if(currentQuestion.userAnswer.equals(currentQuestion.correctAnswer)){
            User.getINSTANCE().addPoints(currentQuestion.calculatePoints());
        }
    }

    public void setInputField(){
        inputField.setText("");
    }

    public void nextQuestion(){
        if(currentQuestion.state instanceof AnsweredState){
            currentQuestion.clickNext(alert);
            displayQuestion();
        }
        else{
            currentQuestion.clickNext(alert);
        }
    }
}

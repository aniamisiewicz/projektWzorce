package sample.controller;

import javafx.event.ActionEvent;
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
        updateQuestion();
        displayQuestion();
    }

    private void updateQuestion() {
        currentQuestion = (QuestionWithInput) iterator.next();
        alert.setText("");
    }

    public void displayQuestion(){
        setInputField();
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
            alert.setText("You have to answer the question first.");
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
            questions.correctAnswerAmount++;
        }
    }

    public void setInputField(){
        inputField.setText("");
    }

    public void nextQuestion(ActionEvent actionEvent){
        if(currentQuestion.state instanceof AnsweredState){
            currentQuestion.clickNext(alert);
            updateQuestion();
            if(currentQuestion != null){
                displayQuestion();
            }
            else{
                goTo.execute(actionEvent, "../view/End.fxml");
            }
        }
        else{
            currentQuestion.clickNext(alert);
        }
    }
}

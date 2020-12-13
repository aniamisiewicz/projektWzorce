package sample.controller;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import sample.model.*;


import java.net.URL;
import java.util.*;

public class OneChoice extends AppController {
    public RadioButton answer0;
    public RadioButton answer1;
    public RadioButton answer2;
    public RadioButton answer3;
    public Label question;
    public Label alert;
    private QuestionWithOneChoice currentQuestion;
    private final IIterator iterator = questions.createIterator();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        setRadioButton();
        updateQuestion();
        displayQuestion();
    }

    private void updateQuestion() {
        currentQuestion = (QuestionWithOneChoice) iterator.next();
        alert.setText("");
    }

    public void displayQuestion(){
        currentQuestion.shuffle();
        question.setText(currentQuestion.getContent());
        answer0.setText(currentQuestion.answers.get(0));
        answer1.setText(currentQuestion.answers.get(1));
        answer2.setText(currentQuestion.answers.get(2));
        answer3.setText(currentQuestion.answers.get(3));
        answer0.setSelected(false);
        answer1.setSelected(false);
        answer2.setSelected(false);
        answer3.setSelected(false);
    }

    public void setRadioButton(){
        ToggleGroup group = new ToggleGroup();
        answer0.setToggleGroup(group);
        answer1.setToggleGroup(group);
        answer2.setToggleGroup(group);
        answer3.setToggleGroup(group);
    }

    public void answerQuestion(){
        if(AnyAnswerIsSelected()){
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

    private boolean AnyAnswerIsSelected(){
        return answer0.isSelected() || answer1.isSelected() || answer2.isSelected() || answer3.isSelected();
    }

    private void setSelectedAnswer(){
        if(answer0.isSelected()){
            currentQuestion.userAnswer = answer0.getText();
        }
        else if(answer1.isSelected()){
            currentQuestion.userAnswer = answer1.getText();
        }
        else if(answer2.isSelected()){
            currentQuestion.userAnswer = answer2.getText();
        }
        else{
            currentQuestion.userAnswer = answer3.getText();
        }
    }

    private void checkAnswer(){
        if(currentQuestion.userAnswer.equals(currentQuestion.correctAnswer)){
            User.getINSTANCE().addPoints(currentQuestion.calculatePoints());
        }
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

package sample.controller;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import sample.model.IIterator;
import sample.model.Question;
import sample.model.QuestionWithOneChoice;


import java.net.URL;
import java.util.ResourceBundle;

public class QuestionSummary extends AppController{
    public Label question;
    public Label userAnswer;
    public Label correctAnswer;
    public Button nextQuestion;
    public Button goToMenu;
    private Question currentQuestion;
    private final IIterator iterator = questions.createIterator();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        updateQuestion();
        displayQuestion();
    }

    private void updateQuestion() {
        currentQuestion = iterator.next();
    }

    public void displayQuestion(){  // factory
        if(currentQuestion.isCorrect()){
            displayCorrect(currentQuestion.clone());
        }
        else{
            displayIncorrect(currentQuestion.clone());
        }
    }

    private void displayCorrect(Question q){
        question.setText(q.getContent());
        userAnswer.setText("Your answer " + q.getUserAnswer() + " is correct!");
        correctAnswer.setText("");
    }

    private void displayIncorrect(Question q){
        question.setText(q.getContent());
        userAnswer.setText("Your answer " + q.getUserAnswer() + " is incorrect!");
        correctAnswer.setText("Correct answer is " + q.getCorrectAnswer() + ".");
    }

    public void nextQuestion(ActionEvent actionEvent){
        updateQuestion();
        if(currentQuestion != null){
            displayQuestion();
        }
        else{
            goTo.execute(actionEvent, "../view/EndOfGame.fxml");
        }
    }

    public void goToMenu(ActionEvent actionEvent){ // nie podpiete???????
        goTo.execute(actionEvent, "../view/Menu.fxml");
    }

    public void endGame(ActionEvent actionEvent){
        System.exit(0);
    }
}

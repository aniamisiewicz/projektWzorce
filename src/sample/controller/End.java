package sample.controller;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import sample.model.User;

import java.net.URL;
import java.util.ResourceBundle;

public class End extends AppController{
    public Label score;
    public Button questionSummary;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        if((double)questions.correctAnswerAmount > (0.7 * (double)questions.getQuestionsList().size())){
            User.getINSTANCE().notifyObservers();
        }
        displayScore();
    }

    public void displayScore(){
        if(User.getINSTANCE().getScore() == 1){
            score.setText("You collected " + User.getINSTANCE().getScore() + " point!");
        }
        else{
            score.setText("You collected " + User.getINSTANCE().getScore() + " points!");
        }
    }

    public void goToQuestionSummary(ActionEvent actionEvent){
        goTo.execute(actionEvent, "../view/QuestionSummary.fxml");
    }
}

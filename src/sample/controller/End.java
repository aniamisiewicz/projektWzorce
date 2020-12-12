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
        displayScore();
    }

    public void displayScore(){
        score.setText("Zdobyłeś " + User.getINSTANCE().getScore() + " punktów!");
    }

    public void goToQuestionSummary(ActionEvent actionEvent){
        goTo.execute(actionEvent, "../view/QuestionSummary.fxml");
    }
}

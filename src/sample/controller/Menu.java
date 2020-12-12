package sample.controller;

import javafx.event.ActionEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class Menu extends AppController {

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public void goToOneChoiceQuestions(ActionEvent actionEvent) {
        createOneChoiceQuestions();
        goTo.execute(actionEvent, "../view/oneChoice.fxml");
    }

    public void goToInputQuestions(ActionEvent actionEvent) {
        createInputQuestions();
        goTo.execute(actionEvent, "../view/input.fxml");
    }

}

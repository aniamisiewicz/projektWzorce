package sample.controller;

import javafx.event.ActionEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class Start extends AppController {

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    }

    public void goToMenu(ActionEvent actionEvent) {
        goTo.execute(actionEvent, "../view/menu.fxml");
    }

}

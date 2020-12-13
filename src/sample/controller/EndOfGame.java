package sample.controller;

import javafx.event.ActionEvent;
import sample.controller.AppController;

import java.net.URL;
import java.util.ResourceBundle;

public class EndOfGame extends AppController {
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public void goToMenu(ActionEvent actionEvent){
        goTo.execute(actionEvent, "../view/Menu.fxml");
    }

    public void endGame(ActionEvent actionEvent){
        System.exit(0);
    }
}

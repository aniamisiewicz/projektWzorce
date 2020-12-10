package sample.model;

import javafx.event.ActionEvent;

public interface ICommand {

    void execute(ActionEvent actionEvent, String path);

}

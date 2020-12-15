package sample.model;

import javafx.event.ActionEvent;

/*
Interface ICommand represents design pattern: COMMAND.
 */

public interface ICommand {

    void execute(ActionEvent actionEvent, String path);

}

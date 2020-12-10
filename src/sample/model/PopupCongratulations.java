package sample.model;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class PopupCongratulations implements IObserver {

    @Override
    public void update() {
        //wyskakiwanie okienka

        Stage popupWindow = new Stage();
        popupWindow.initModality(Modality.APPLICATION_MODAL);
        popupWindow.setTitle("Congratulations!");
        Label label1 = new Label("You have " + User.getINSTANCE().getScore() + " points!");
        Button button1 = new Button("Close");
        button1.setOnAction(e -> popupWindow.close());
        VBox layout = new VBox(10);
        layout.getChildren().addAll(label1, button1);
        layout.setAlignment(Pos.CENTER);
        Scene scene1 = new Scene(layout, 300, 100);
        popupWindow.setScene(scene1);
        popupWindow.showAndWait();

    }
}
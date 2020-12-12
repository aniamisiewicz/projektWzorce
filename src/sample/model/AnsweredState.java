package sample.model;

import javafx.scene.control.Label;

public class AnsweredState extends State {

    public AnsweredState(Question question) {
        super(question);
    }

    @Override
    public void clickAnswer(Label label) {
        label.setText("Nie możesz odpowiedzieć ponownie.");
    }

    @Override
    public void clickNext(Label label) {
        label.setText("");
    }
}

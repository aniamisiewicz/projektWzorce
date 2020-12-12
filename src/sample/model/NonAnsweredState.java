package sample.model;


import javafx.scene.control.Label;

public class NonAnsweredState extends State {

    public NonAnsweredState(Question question) {
        super(question);
    }

    @Override
    public void clickAnswer(Label label) {
        question.changeState(new AnsweredState(question));
        label.setText("");
    }

    @Override
    public void clickNext(Label label) {
        label.setText("Musisz najpierw odpowiedzieć.");
    }
}

package sample.model;

import javafx.scene.control.Label;

public abstract class State {

    Question question;

    public State(Question question) {
        this.question = question;
    }

    abstract void clickAnswer(Label label);
    abstract void clickNext(Label label);

}

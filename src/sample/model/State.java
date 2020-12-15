package sample.model;

import javafx.scene.control.Label;

/*
State class represents design pattern: STATE.
 */

public abstract class State {

    Question question;

    public State(Question question) {
        this.question = question;
    }

    abstract void clickAnswer(Label label);
    abstract void clickNext(Label label);

}

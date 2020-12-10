package sample.model;

public abstract class State {

    Question question;

    public State(Question question) {
        this.question = question;
    }

    abstract void clickAnswer();
    abstract void clickNext();

}

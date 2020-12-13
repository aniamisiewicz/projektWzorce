package sample.model;

import javafx.scene.control.Label;

public abstract class Question implements IQuestion {

    private int id;
    private String content;
    public State state;
    public String correctAnswer;
    public String userAnswer;

    /*public Question(int id, String content, List<String> answers, int correctAnswer) {
        this.id = id;
        this.content = content;
        this.answers = List.copyOf(answers);
        this.correctAnswer = correctAnswer;
        state = new NonAnsweredState(this);
    }*/

    public Question() {}

    public Question(Question question) {
        if (question != null) {
            id = question.id;
            content = question.content;
            state = question.state;
            correctAnswer = question.correctAnswer;
            userAnswer = question.userAnswer;
        }
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public boolean isCorrect(){
        return userAnswer == correctAnswer;
    }

    public String getUserAnswer() {
        return userAnswer;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public void changeState(State state) {
        this.state = state;
    }

    public void clickAnswer(Label label) {
        state.clickAnswer(label);
    }

    public void clickNext(Label label) {
        state.clickNext(label);
    }

    public int calculatePoints() {
        return 1;
    }

    public abstract Question clone();


}

package sample.model;

/*
QuestionDecorator class represents design pattern: DECORATOR.
 */

public abstract class QuestionDecorator extends Question {

    private Question question;

    public QuestionDecorator(Question question) {
        super(question);
        this.question = question;
    }

    @Override
    public int calculatePoints() {
        return question.calculatePoints();
    }
}

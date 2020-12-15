package sample.model;

/*
QuestionWithBonus class represents design pattern: DECORATOR.
 */

public class QuestionWithBonus extends QuestionDecorator {

    public QuestionWithBonus(Question question) {
        super(question);
    }

    @Override
    public int calculatePoints() {
        return super.calculatePoints() + 1;
    }

    @Override
    public Question clone() {
        return new QuestionWithBonus(this);
    }
}

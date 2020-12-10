package sample.model;

public class QuestionWithBonus extends QuestionDecorator {

    public QuestionWithBonus(Question question) {
        super(question);
    }

    @Override
    public int calculatePoints() {
        return super.calculatePoints() + 1;
    }
}

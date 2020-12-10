package sample.model;

public class QuestionsIterator implements IIterator {

    private final Questions questions;
    private int currentPosition;

    public QuestionsIterator(Questions questions) {
        this.questions = questions;
        currentPosition = 0;
    }

    @Override
    public Question next() {
        if (hasNext()) {
            return questions.getQuestionsList().get(currentPosition++);
        }
        return null;
    }

    @Override
    public boolean hasNext() {
        return currentPosition < questions.getQuestionsList().size();
    }
}

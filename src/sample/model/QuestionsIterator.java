package sample.model;

/*
QuestionsIterator class represents design pattern: ITERATOR.
 */

public class QuestionsIterator implements IIterator {

    private final Questions questions;
    private int currentPosition;

    public QuestionsIterator(Questions questions) {
        this.questions = questions;
        currentPosition = -1;
    }

    @Override
    public Question next() {
        if (hasNext()) {
            return questions.getQuestionsList().get(++currentPosition);
        }
        return null;
    }

    @Override
    public boolean hasNext() {
        return currentPosition < questions.getQuestionsList().size() - 1;
    }
}

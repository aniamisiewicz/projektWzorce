package sample.model;

import java.util.ArrayList;
import java.util.List;

public class Questions {

    private List<Question> questionsList;
    public int correctAnswerAmount = 0;

    public Questions() {
        questionsList = new ArrayList<>();
    }

    public List<Question> getQuestionsList() {
        return questionsList;
    }

    public void addQuestion(Question question) {
        questionsList.add(question);
    }

    public void removeQuestion(Question question) {
        questionsList.remove(question);
    }

    public IIterator createIterator() {
        return new QuestionsIterator(this);
    }

    public void clear(){
        questionsList.clear();
    }


}

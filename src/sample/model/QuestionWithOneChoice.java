package sample.model;

import java.util.List;

public class QuestionWithOneChoice extends Question {

    public List<String> answers;
    public int correctAnswer;

    public QuestionWithOneChoice() {}

    public QuestionWithOneChoice(QuestionWithOneChoice question) {
        super(question);
        if (question != null) {
            answers = List.copyOf(question.answers);
            correctAnswer = question.correctAnswer;
        }
    }
    
    @Override
    public Question clone() {
        return new QuestionWithOneChoice(this);
    }
}

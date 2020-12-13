package sample.model;

import java.util.*;

public class QuestionWithOneChoice extends Question {

    public List<String> answers;

    public QuestionWithOneChoice() {}

    public QuestionWithOneChoice(QuestionWithOneChoice question) {
        super(question);
        if (question != null) {
            answers = List.copyOf(question.answers);
            correctAnswer = question.correctAnswer;
        }
    }

    public void shuffle(){
        Random r = new Random();
        List<Integer> l = Arrays.asList(0,1,2,3);
        Collections.shuffle(l, r);
        String[] tmp = new String[4];
        for(int i = 0; i < 4; i++) {
            tmp[l.get(i)] = answers.get(i);
        }
        answers = Arrays.asList(tmp.clone());
    }

    @Override
    public Question clone() {
        return new QuestionWithOneChoice(this);
    }
}

package sample.controller;

import sample.model.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public abstract class AppController implements IInitializable {

    GoTo goTo = new GoTo();
    static Questions questions = new Questions();

    public void createOneChoiceQuestions() {
        questions.clear();
        List<Question> temp = new ArrayList<>();
        QuestionWithOneChoice withOneChoice = new QuestionWithOneChoice();
        withOneChoice.setContent("Question0?");
        List<String> answers = new ArrayList<>();
        answers.add("ans0");
        answers.add("ans1");
        answers.add("ans2");
        answers.add("ans3");
        withOneChoice.answers = answers;
        withOneChoice.correctAnswer = "ans0";
        temp.add(withOneChoice);
        withOneChoice.state = new NonAnsweredState(withOneChoice);

        QuestionWithOneChoice withOneChoice2 = new QuestionWithOneChoice();
        withOneChoice2.setContent("Question1?");
        List<String> answers2 = new ArrayList<>();
        answers2.add("ans0 2");
        answers2.add("ans1 2");
        answers2.add("ans2 2");
        answers2.add("ans3 2");
        withOneChoice2.answers = answers2;
        withOneChoice2.correctAnswer = "ans0 2";
        temp.add(withOneChoice2);
        withOneChoice2.state = new NonAnsweredState(withOneChoice2);

        Collections.shuffle(temp);
        for(int i = 0; i < 2; i++){
            questions.addQuestion(temp.get(i));
        }
    }

    public void createInputQuestions() {
        questions.clear();
        List<Question> temp = new ArrayList<>();
        QuestionWithInput withInput = new QuestionWithInput();
        withInput.setContent("Question0?");
        withInput.correctAnswer = "answer";
        temp.add(withInput);
        withInput.state = new NonAnsweredState(withInput);

        QuestionWithInput withInput2 = new QuestionWithInput();
        withInput2.setContent("Question1?");
        withInput2.correctAnswer = "answer";
        temp.add(withInput2);
        withInput2.state = new NonAnsweredState(withInput2);

        Collections.shuffle(temp);
        for(int i = 0; i < 2; i++){
            questions.addQuestion(temp.get(i));
        }
    }
}

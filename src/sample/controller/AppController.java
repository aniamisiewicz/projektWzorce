package sample.controller;

import javafx.fxml.Initializable;
import sample.model.*;

import java.util.ArrayList;
import java.util.List;


public abstract class AppController implements IInitializable {

    GoTo goTo = new GoTo();
    static Questions questions = new Questions();

    public void createOneChoiceQuestions() {
        QuestionWithOneChoice withOneChoice = new QuestionWithOneChoice();
        withOneChoice.setContent("Question0?");
        List<String> answers = new ArrayList<>();
        answers.add("ans0");
        answers.add("ans1");
        answers.add("ans2");
        answers.add("ans3");
        withOneChoice.answers = answers;
        withOneChoice.correctAnswer = 0;
        questions.addQuestion(withOneChoice);
        withOneChoice.state = new NonAnsweredState(withOneChoice);

        QuestionWithOneChoice withOneChoice2 = new QuestionWithOneChoice();
        withOneChoice2.setContent("Question1?");
        List<String> answers2 = new ArrayList<>();
        answers2.add("ans0 2");
        answers2.add("ans1 2");
        answers2.add("ans2 2");
        answers2.add("ans3 2");
        withOneChoice2.answers = answers2;
        withOneChoice2.correctAnswer = 0;
        questions.addQuestion(withOneChoice2);
        withOneChoice2.state = new NonAnsweredState(withOneChoice2);

    }

    public void createInputQuestions() {
        QuestionWithInput withInput = new QuestionWithInput();
        withInput.setContent("Question0?");
        withInput.correctAnswer = "answer";
        questions.addQuestion(withInput);
        withInput.state = new NonAnsweredState(withInput);

        QuestionWithInput withInput2 = new QuestionWithInput();
        withInput2.setContent("Question1?");
        withInput2.correctAnswer = "answer";
        questions.addQuestion(withInput2);
        withInput2.state = new NonAnsweredState(withInput2);

    }
}

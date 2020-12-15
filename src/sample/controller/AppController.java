package sample.controller;

import sample.model.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
Implementing IInitializable (overriding initialize method) and extending AppController by other classes in
controller package represent design pattern: TEMPLATE METHOD.
 */

public abstract class AppController implements IInitializable {

    GoTo goTo = new GoTo();
    static Questions questions = new Questions();

    public void createOneChoiceQuestions() {
        set();
        List<Question> temp = new ArrayList<>();

        QuestionWithOneChoice q1 = new QuestionWithOneChoice();
        q1.setContent("5 * 6 = ?");
        List<String> ans1 = new ArrayList<>();
        ans1.add("30");
        ans1.add("25");
        ans1.add("40");
        ans1.add("35");
        q1.answers = ans1;
        q1.correctAnswer = "30";
        temp.add(q1);
        q1.state = new NonAnsweredState(q1);

        QuestionWithOneChoice q2 = new QuestionWithOneChoice();
        q2.setContent("9 + 3 + 2 + 0 = ?");
        List<String> ans2 = new ArrayList<>();
        ans2.add("20");
        ans2.add("15");
        ans2.add("13");
        ans2.add("14");
        q2.answers = ans2;
        q2.correctAnswer = "14";
        temp.add(q2);
        q2.state = new NonAnsweredState(q2);

        QuestionWithOneChoice q3 = new QuestionWithOneChoice();
        q3.setContent("4 - 2 + 5 = ?");
        List<String> ans3 = new ArrayList<>();
        ans3.add("6");
        ans3.add("5");
        ans3.add("7");
        ans3.add("3");
        q3.answers = ans3;
        q3.correctAnswer = "7";
        temp.add(q3);
        q3.state = new NonAnsweredState(q3);

        QuestionWithOneChoice q4 = new QuestionWithOneChoice();
        q4.setContent("(2 + 2) - 3 = ?");
        List<String> ans4 = new ArrayList<>();
        ans4.add("0");
        ans4.add("2");
        ans4.add("3");
        ans4.add("1");
        q4.answers = ans4;
        q4.correctAnswer = "1";
        temp.add(q4);
        q4.state = new NonAnsweredState(q4);

        QuestionWithOneChoice q5 = new QuestionWithOneChoice();
        q5.setContent("5 * 8 - 8 * 5 = ?");
        List<String> ans5 = new ArrayList<>();
        ans5.add("40");
        ans5.add("1");
        ans5.add("0");
        ans5.add("5");
        q5.answers = ans5;
        q5.correctAnswer = "0";
        temp.add(q5);
        q5.state = new NonAnsweredState(q5);

        QuestionWithOneChoice q6 = new QuestionWithOneChoice();
        q6.setContent("25 - 24 = ?");
        List<String> ans6 = new ArrayList<>();
        ans6.add("2");
        ans6.add("1");
        ans6.add("0");
        ans6.add("4");
        q6.answers = ans6;
        q6.correctAnswer = "1";
        temp.add(q6);
        q6.state = new NonAnsweredState(q6);

        QuestionWithOneChoice q7 = new QuestionWithOneChoice();
        q7.setContent("10 - 5 = ?");
        List<String> ans7 = new ArrayList<>();
        ans7.add("5");
        ans7.add("0");
        ans7.add("20");
        ans7.add("3");
        q7.answers = ans7;
        q7.correctAnswer = "5";
        temp.add(q7);
        q7.state = new NonAnsweredState(q7);

        QuestionWithOneChoice q8 = new QuestionWithOneChoice();
        q8.setContent("5 - 2 = ?");
        List<String> ans8 = new ArrayList<>();
        ans8.add("5");
        ans8.add("0");
        ans8.add("2");
        ans8.add("3");
        q8.answers = ans8;
        q8.correctAnswer = "3";
        temp.add(q8);
        q8.state = new NonAnsweredState(q8);

        QuestionWithOneChoice q9 = new QuestionWithOneChoice();
        q9.setContent("3 * 9 = ?");
        List<String> ans9 = new ArrayList<>();
        ans9.add("27");
        ans9.add("18");
        ans9.add("36");
        ans9.add("50");
        q9.answers = ans9;
        q9.correctAnswer = "27";
        temp.add(q9);
        q9.state = new NonAnsweredState(q9);

        QuestionWithOneChoice q10 = new QuestionWithOneChoice();
        q10.setContent("2 * 2 * 2 = ?");
        List<String> ans10 = new ArrayList<>();
        ans10.add("8");
        ans10.add("4");
        ans10.add("6");
        ans10.add("2");
        q10.answers = ans10;
        q10.correctAnswer = "8";
        temp.add(q10);
        q10.state = new NonAnsweredState(q10);

        Collections.shuffle(temp);
        addQuestions(temp);
    }

    public void createInputQuestions() {
        set();
        List<Question> temp = new ArrayList<>();

        QuestionWithInput q1 = new QuestionWithInput();
        q1.setContent("6 / 2 = ?");
        q1.correctAnswer = "3";
        temp.add(q1);
        q1.state = new NonAnsweredState(q1);

        QuestionWithInput q2 = new QuestionWithInput();
        q2.setContent("4 * 8 = ?");
        q2.correctAnswer = "32";
        temp.add(q2);
        q2.state = new NonAnsweredState(q2);

        QuestionWithInput q3 = new QuestionWithInput();
        q3.setContent("7 * 9 = ?");
        q3.correctAnswer = "63";
        temp.add(q3);
        q3.state = new NonAnsweredState(q3);

        QuestionWithInput q4 = new QuestionWithInput();
        q4.setContent("3 * 0 = ?");
        q4.correctAnswer = "0";
        temp.add(q4);
        q4.state = new NonAnsweredState(q4);

        QuestionWithInput q5 = new QuestionWithInput();
        q5.setContent("2 * 5 * 1 = ?");
        q5.correctAnswer = "10";
        temp.add(q5);
        q5.state = new NonAnsweredState(q5);


        Question q6 = new QuestionWithBonus(new QuestionWithInput());
        q6.setContent("4 * 5 - 4 / 2 = ?");
        q6.correctAnswer = "18";
        temp.add(q6);
        q6.state = new NonAnsweredState(q6);

        Question q7 = new QuestionWithBonus(new QuestionWithInput());
        q7.setContent("3 * 5 + 2 = ?");
        q7.correctAnswer = "17";
        temp.add(q7);
        q7.state = new NonAnsweredState(q7);

        Question q8 = new QuestionWithBonus(new QuestionWithInput());
        q8.setContent("3 - 7 * 0 + 3 = ?");
        q8.correctAnswer = "6";
        temp.add(q8);
        q8.state = new NonAnsweredState(q8);

        Question q9 = new QuestionWithBonus(new QuestionWithInput());
        q9.setContent("6 / 2 - 1 = ?");
        q9.correctAnswer = "2";
        temp.add(q9);
        q9.state = new NonAnsweredState(q9);

        Question q10 = new QuestionWithBonus(new QuestionWithInput());
        q10.setContent("15 / 3 - 5 = ?");
        q10.correctAnswer = "0";
        temp.add(q10);
        q10.state = new NonAnsweredState(q10);

        Collections.shuffle(temp);
        addQuestions(temp);
    }

    public void addQuestions(List<Question> temp){
        for(int i = 0; i < 5; i++){
            questions.addQuestion(temp.get(i));
        }
    }

    public void set(){
        questions.clear();
        questions.correctAnswerAmount = 0;
        User.getINSTANCE().clearPoints();
    }
}

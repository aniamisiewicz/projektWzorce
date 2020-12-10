package sample.model;

public class QuestionWithInput extends Question {

    public String input;
    public String correctAnswer;

    public QuestionWithInput() {}

    public QuestionWithInput(QuestionWithInput questionWithInput) {
        super(questionWithInput);
        if (questionWithInput != null) {
            input = questionWithInput.input;
            correctAnswer = questionWithInput.correctAnswer;
        }
    }

    @Override
    public Question clone() {
        return new QuestionWithInput(this);
    }
}

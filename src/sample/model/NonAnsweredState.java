package sample.model;

public class NonAnsweredState extends State {

    public NonAnsweredState(Question question) {
        super(question);
    }

    @Override
    void clickAnswer() {
        question.changeState(new AnsweredState(question));
    }

    @Override
    void clickNext() {
        System.out.println("NIE MOZNA JESZCZE PRZEJSC DO NASTEPNEGO OKNA");
    }
}

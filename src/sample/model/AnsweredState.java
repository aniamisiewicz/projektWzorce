package sample.model;

public class AnsweredState extends State {

    public AnsweredState(Question question) {
        super(question);
    }

    @Override
    void clickAnswer() {
        System.out.println("NIE MOZNA JUZ ODPOWIEDZIEC");
    }

    @Override
    void clickNext() {
        //przejscie do kolejnego okna
    }
}

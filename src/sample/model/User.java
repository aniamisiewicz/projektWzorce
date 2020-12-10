package sample.model;

import java.util.ArrayList;
import java.util.List;

public final class User implements IObservable {

    private static User INSTANCE;
    private static String name;
    private int score;
    private List<IObserver> observerList = new ArrayList<>();

    private User() {
        score = 0;
    }

    public static User getINSTANCE() {
        if (INSTANCE == null) {
            INSTANCE = new User();
        }
        return INSTANCE;
    }

    public static void setName(String name) {
        User.name = name;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public void addPoints(int points) {
        score += points;
        if (score != 0 && score % 10 == 0) {
            notifyObservers();
        }
    }

    @Override
    public void attach(IObserver observer) {
        observerList.add(observer);
    }

    @Override
    public void detach(IObserver observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observerList.forEach(IObserver::update);
    }


}

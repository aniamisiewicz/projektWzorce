package sample.model;

import java.util.ArrayList;
import java.util.List;

/*
User class represents design pattern: SINGLETON.
 */

public final class User implements IObservable {

    private static User INSTANCE;
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

    public int getScore() {
        return score;
    }

    public void addPoints(int points) {
        score += points;
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

    public void clearPoints(){
        score = 0;
    }


}

package sample.model;

public interface IObservable {

    void attach(IObserver observer);
    void detach(IObserver observer);
    void notifyObservers();

}

package lab6.observer;

import java.util.ArrayList;
import java.util.List;

public class BossStateManager {
    private String currentState;
    private final List<BossStateObserver> observers;

    public BossStateManager() {
        observers = new ArrayList<>();
    }

    public void addObserver(BossStateObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(BossStateObserver observer) {
        observers.remove(observer);
    }

    public void setState(String newState) {
        this.currentState = newState;
        notifyObservers();
    }

    private void notifyObservers() {
        for (BossStateObserver observer : observers) {
            observer.onStateChanged(currentState);
        }
    }
}

package lab6.observer;

public class BossUI implements BossStateObserver {
    @Override
    public void onStateChanged(String newState) {
        System.out.println("Состояние босса изменилось на: " + newState);
    }
}
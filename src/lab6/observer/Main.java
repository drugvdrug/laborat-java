package lab6.observer;

public class Main {
    public static void main(String[] args) {
        BossStateManager bossStateManager = new BossStateManager();
        BossUI bossUI = new BossUI();

        bossStateManager.addObserver(bossUI);

        bossStateManager.setState("rageMode");
        bossStateManager.setState("stunned");
    }
}
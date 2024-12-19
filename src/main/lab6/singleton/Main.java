package main.lab6.singleton;

public class Main {
    public static void main(String[] args) {
        InputManager inputManager = InputManager.getInstance("input_log.txt");
        inputManager.registerKeyBinding("Jump", "Space");
        inputManager.registerKeyBinding("Shoot", "Ctrl");

        System.out.println("Key for Jump: " + inputManager.getKeyForAction("Jump"));
        System.out.println("Key for Shoot: " + inputManager.getKeyForAction("Shoot"));
    }
}

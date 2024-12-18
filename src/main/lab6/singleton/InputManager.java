package main.lab6.singleton;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class InputManager {
    private static InputManager instance;
    private Map<String, String> keyBindings;
    private String logFilePath;

    private InputManager(String logFilePath) {
        this.keyBindings = new HashMap<>();
        this.logFilePath = logFilePath;
    }

    public static InputManager getInstance(String logFilePath) {
        if (instance == null) {
            instance = new InputManager(logFilePath);
        }
        return instance;
    }

    public void registerKeyBinding(String action, String key) {
        keyBindings.put(action, key);
        logInput("Registered action: " + action + " with key: " + key);
    }

    public String getKeyForAction(String action) {
        return keyBindings.get(action);
    }

    private void logInput(String input) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(logFilePath, true))) {
            writer.write(LocalDateTime.now() + ": " + input);
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
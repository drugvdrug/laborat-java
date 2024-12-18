package lab6.singletone;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

import static java.lang.Thread.sleep;

public class SessionManager {
    private static SessionManager instance;
    private String sessionId;
    private LocalDateTime startTime;
    private LocalDateTime endTime;

    private SessionManager() {}

    public static synchronized SessionManager getInstance() {
        if (instance == null) {
            instance = new SessionManager();
        }
        return instance;
    }

    public void startSession(String sessionId) {
        this.sessionId = sessionId;
        this.startTime = LocalDateTime.now();
        System.out.println("Сессия " + sessionId + " начата в " + startTime);
    }

    public void endSession() {
        this.endTime = LocalDateTime.now();
        System.out.println("Сессия " + sessionId + " завершена в " + endTime);
        logSessionInfo();
    }

    public String getSessionInfo() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return "Session ID: " + sessionId + "\n" +
                "Start Time: " + (startTime != null ? startTime.format(formatter) : "Not started") + "\n" +
                "End Time: " + (endTime != null ? endTime.format(formatter) : "Not ended");
    }

    private void logSessionInfo() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("session_log.txt", true))) {
            writer.write("Session ID: " + sessionId + "\n");
            writer.write("Start Time: " + startTime + "\n");
            writer.write("End Time: " + endTime + "\n");
            writer.write("====================================\n");
        } catch (IOException e) {
            System.err.println("Ошибка при записи в файл: " + e.getMessage());
        }
    }

    // Пример использования
    public static void main(String[] args) throws InterruptedException {
        SessionManager sessionManager = SessionManager.getInstance();
        Random rnd = new Random();
        sessionManager.startSession("GameSession" + rnd.nextLong(5000000));
        sleep(5000);
        sessionManager.endSession();
        System.out.println(sessionManager.getSessionInfo());
    }
}
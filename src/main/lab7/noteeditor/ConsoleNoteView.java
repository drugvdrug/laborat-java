package main.lab7.noteeditor;

import java.util.Scanner;

public class ConsoleNoteView implements NoteView {
    private Scanner scanner = new Scanner(System.in);

    @Override
    public void displayNotes(Note[] notes) {
        System.out.println("Notes:");
        for (int i = 0; i < notes.length; i++) {
            System.out.println(i + ": " + notes[i].getTitle());
        }
    }

    @Override
    public void displayMessage(String message) {
        System.out.println(message);
    }

    @Override
    public Note getNoteInput() {
        System.out.print("Enter note title: ");
        String title = scanner.nextLine();
        System.out.print("Enter note content: ");
        String content = scanner.nextLine();
        return new Note(title, content);
    }

    @Override
    public int getNoteIndex() {
        System.out.print("Enter note index: ");
        return Integer.parseInt(scanner.nextLine());
    }
}

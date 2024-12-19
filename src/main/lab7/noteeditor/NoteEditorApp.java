package main.lab7.noteeditor;

import java.util.Scanner;

public class NoteEditorApp {
    public static void main(String[] args) {
        NoteView view = new ConsoleNoteView();
        NotePresenter presenter = new NotePresenter(view);
        Scanner scanner = new Scanner(System.in);
        String command;

        while (true) {
            System.out.println("\nEnter command (add, edit, delete, display, exit): ");
            command = scanner.nextLine();

            switch (command.toLowerCase()) {
                case "add":
                    presenter.addNote();
                    break;
                case "edit":
                    presenter.editNote();
                    break;
                case "delete":
                    presenter.deleteNote();
                    break;
                case "display":
                    presenter.displayNotes();
                    break;
                case "exit":
                    System.out.println("Exiting the note editor.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Unknown command. Please try again.");
            }
        }
    }
}
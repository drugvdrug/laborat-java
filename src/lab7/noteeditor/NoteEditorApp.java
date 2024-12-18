package lab7.noteeditor;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Модель заметки
class Note {
    private String title;
    private String content;

    public Note(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }
}

// Интерфейс представления
interface NoteView {
    void displayNotes(Note[] notes);
    void displayMessage(String message);
    Note getNoteInput();
    int getNoteIndex();
}

// Реализация представления в консоли
class ConsoleNoteView implements NoteView {
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


class NotePresenter {
    private NoteView view;
    private List<Note> notes;

    public NotePresenter(NoteView view) {
        this.view = view;
        this.notes = new ArrayList<>();
    }

    public void addNote() {
        Note note = view.getNoteInput();
        notes.add(note);
        view.displayMessage("Note added.");
    }

    public void editNote() {
        int index = view.getNoteIndex();
        if (index >= 0 && index < notes.size()) {
            Note note = view.getNoteInput();
            notes.set(index, note);
            view.displayMessage("Note updated.");
        } else {
            view.displayMessage("Invalid note index.");
        }
    }

    public void deleteNote() {
        int index = view.getNoteIndex();
        if (index >= 0 && index < notes.size()) {
            notes.remove(index);
            view.displayMessage("Note deleted.");
        } else {
            view.displayMessage("Invalid note index.");
        }
    }

    public void displayNotes() {
        if (notes.isEmpty()) {
            view.displayMessage("No notes available.");
        } else {
            view.displayNotes(notes.toArray(new Note[0]));
        }
    }
}

// Главный класс для запуска приложения
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
package main.lab7.noteeditor;

import java.util.ArrayList;
import java.util.List;

public class NotePresenter {
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

package main.lab7.noteeditor;

public interface NoteView {
    void displayNotes(Note[] notes);

    void displayMessage(String message);

    Note getNoteInput();

    int getNoteIndex();
}

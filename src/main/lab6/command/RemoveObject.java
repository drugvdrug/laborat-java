package main.lab6.command;

public class RemoveObject implements Command {
    private String objectName;

    public RemoveObject(String objectName) {
        this.objectName = objectName;
    }

    @Override
    public void execute() {
        System.out.println("Удаление объекта: " + objectName);
    }
}

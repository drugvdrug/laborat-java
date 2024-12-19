package main.lab6.command;

public class AddObject implements Command {
    private String objectName;

    public AddObject(String objectName) {
        this.objectName = objectName;
    }

    @Override
    public void execute() {
        System.out.println("Добавление объекта: " + objectName);
    }
}

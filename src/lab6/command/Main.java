package lab6.command;

import java.util.ArrayList;
import java.util.List;

// Интерфейс команды
interface Command {
    void execute();
}

// Команда для добавления объекта
class AddObject implements Command {
    private String objectName;

    public AddObject(String objectName) {
        this.objectName = objectName;
    }

    @Override
    public void execute() {
        System.out.println("Добавление объекта: " + objectName);
    }
}

// Команда для удаления объекта
class RemoveObject implements Command {
    private String objectName;

    public RemoveObject(String objectName) {
        this.objectName = objectName;
    }

    @Override
    public void execute() {
        System.out.println("Удаление объекта: " + objectName);
    }
}

// Команда для изменения типа местности
class ChangeTerrain implements Command {
    private String terrainType;

    public ChangeTerrain(String terrainType) {
        this.terrainType = terrainType;
    }

    @Override
    public void execute() {
        System.out.println("Изменение типа местности на: " + terrainType);
    }
}

// Класс для макроса, который объединяет команды
class MacroCommand implements Command {
    private List<Command> commands = new ArrayList<>();

    // Метод для добавления команды в макрос
    public void addCommand(Command command) {
        commands.add(command);
    }

    @Override
    public void execute() {
        for (Command command : commands) {
            command.execute();
        }
    }
}

// Пример использования
public class Main {
    public static void main(String[] args) {
        // Создаем команды
        Command addTree = new AddObject("Дерево");
        Command removeRock = new RemoveObject("Скала");
        Command changeToWater = new ChangeTerrain("Вода");

        // Создаем макрос и добавляем команды
        MacroCommand macro = new MacroCommand();
        macro.addCommand(addTree);
        macro.addCommand(removeRock);
        macro.addCommand(changeToWater);

        // Выполняем макрос
        System.out.println("Выполнение макроса:");
        macro.execute();
    }
}
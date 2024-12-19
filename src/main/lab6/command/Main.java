package main.lab6.command;

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
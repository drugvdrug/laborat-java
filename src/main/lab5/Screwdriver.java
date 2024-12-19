package main.lab5;

public class Screwdriver extends Tool implements ElectricTool {
    public Screwdriver() {
        super("Электрическая отвертка");
    }

    @Override
    public void use() {
        System.out.println("Используется электрическая отвертка для закручивания винтов.");
    }

    @Override
    public void charge() {
        System.out.println("Зарядка электрической отвертки.");
    }
}

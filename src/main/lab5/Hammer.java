package main.lab5;

public class Hammer extends Tool {
    public Hammer() {
        super("Молоток");
    }

    @Override
    public void use() {
        System.out.println("Используется молоток для забивания гвоздей.");
    }
}

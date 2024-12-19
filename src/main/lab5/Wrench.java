package main.lab5;

public class Wrench extends Tool {
    public Wrench() {
        super("Гаечный ключ");
    }

    @Override
    public void use() {
        System.out.println("Используется гаечный ключ для затягивания гаек.");
    }
}

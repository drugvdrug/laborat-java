package main.lab5;

// Интерфейс ElectricTool
interface ElectricTool {
    void charge();
}

// Базовый класс Tool
abstract class Tool {
    private String name;

    public Tool(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void use();
}

// Подкласс Hammer
class Hammer extends Tool {
    public Hammer() {
        super("Молоток");
    }

    @Override
    public void use() {
        System.out.println("Используется молоток для забивания гвоздей.");
    }
}

// Подкласс Screwdriver
class Screwdriver extends Tool implements ElectricTool {
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

// Подкласс Wrench
class Wrench extends Tool {
    public Wrench() {
        super("Гаечный ключ");
    }

    @Override
    public void use() {
        System.out.println("Используется гаечный ключ для затягивания гаек.");
    }
}

// Пример использования
public class Main {
    public static void main(String[] args) {
        Tool hammer = new Hammer();
        Screwdriver screwdriver = new Screwdriver();
        Tool wrench = new Wrench();

        hammer.use();
        screwdriver.use();
        screwdriver.charge(); // Приведение типа для вызова charge()
        wrench.use();
    }
}
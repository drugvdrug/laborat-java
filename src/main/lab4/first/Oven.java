package main.lab4.first;

public class Oven extends Appliance {
    public Oven(String model) {
        super(model);
    }

    @Override
    public void turnOn() {
        System.out.println("Духовка включена");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Тип: Духовка");
    }
}
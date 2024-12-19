package main.lab4.first;

public class Refrigerator extends Appliance {
    public Refrigerator(String model) {
        super(model);
    }

    @Override
    public void turnOn() {
        System.out.println("Холодильник включён");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Тип: Холодильник");
    }
}

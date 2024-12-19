package main.lab4.first;

public class WashingMachine extends Appliance {
    public WashingMachine(String model) {
        super(model);
    }

    @Override
    public void turnOn() {
        System.out.println("Стиральная машина включена");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Тип: Стиральная машина");
    }
}

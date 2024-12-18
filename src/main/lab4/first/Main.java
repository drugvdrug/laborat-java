package main.lab4.first;

class Appliance {
    private String model;

    public Appliance(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void turnOn() {
        System.out.println("Прибор включён");
    }

    public void displayInfo() {
        System.out.println("Модель: " + model);
    }
}

class WashingMachine extends Appliance {
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

class Refrigerator extends Appliance {
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

class Oven extends Appliance {
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

class House {
    private Appliance[] appliances;
    private int count;

    public House(int size) {
        appliances = new Appliance[size];
        count = 0;
    }

    public void addAppliance(Appliance appliance) {
        if (count < appliances.length) {
            appliances[count++] = appliance;
        } else {
            System.out.println("Массив приборов полон");
        }
    }

    public Appliance popAppliance() {
        if (count > 0) {
            Appliance appliance = appliances[--count];
            appliances[count] = null;
            return appliance;
        } else {
            System.out.println("Нет приборов для удаления");
            return null;
        }
    }

    public void turnOnAll() {
        for (int i = 0; i < count; i++) {
            appliances[i].turnOn();
        }
    }

    public void displayAllInfo() {
        for (int i = 0; i < count; i++) {
            appliances[i].displayInfo();
            System.out.println();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        House house = new House(5);

        WashingMachine wm = new WashingMachine("LG WM1234");
        Refrigerator fridge = new Refrigerator("Samsung RF5678");
        Oven oven = new Oven("Bosch HBG634BS1");

        house.addAppliance(wm);
        house.addAppliance(fridge);
        house.addAppliance(oven);

        System.out.println("Включаем все приборы:");
        house.turnOnAll();

        System.out.println("\nИнформация о всех приборах:");
        house.displayAllInfo();
    }
}
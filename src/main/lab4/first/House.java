package main.lab4.first;

public class House {
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

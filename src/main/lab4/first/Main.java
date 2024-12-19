package main.lab4.first;

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
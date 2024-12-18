package lab6.flyweight;

public class Main {
    public static void main(String[] args) {
        CrystalFactory crystalFactory = new CrystalFactory();

        // Создание кристаллов с общими свойствами
        CrystalType redDiamond = crystalFactory.getCrystalType("Red", "Diamond");
        Crystal crystal1 = new Crystal(redDiamond, 10, 20, 5);
        crystal1.display();

        CrystalType blueDiamond = crystalFactory.getCrystalType("Blue", "Diamond");
        Crystal crystal2 = new Crystal(blueDiamond, 30, 40, 10);
        crystal2.display();

        // Повторное использование общего типа кристалла
        Crystal crystal3 = new Crystal(redDiamond, 50, 60, 7);
        crystal3.display();
    }
}
package main.lab5;

public class Main {
    public static void main(String[] args) {
        Tool hammer = new Hammer();
        Screwdriver screwdriver = new Screwdriver();
        Tool wrench = new Wrench();

        hammer.use();
        screwdriver.use();
        screwdriver.charge();
        wrench.use();
    }
}
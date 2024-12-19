package main.lab6.fabric;

public class Main {
    public static void main(String[] args) {
        VehicleFactory factory = new VehicleFactory();

        Vehicle car = factory.createVehicle("car");
        car.move();

        Vehicle boat = factory.createVehicle("boat");
        boat.move();
    }
}
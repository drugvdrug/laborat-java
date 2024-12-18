package main.lab6.fabric;

// Интерфейс Vehicle
interface Vehicle {
    void move();
}

// Класс Car
class Car implements Vehicle {
    @Override
    public void move() {
        System.out.println("Машина едет по дороге.");
    }
}

// Класс Boat
class Boat implements Vehicle {
    @Override
    public void move() {
        System.out.println("Лодка плывет по воде.");
    }
}

// Класс VehicleFactory
class VehicleFactory {
    public Vehicle createVehicle(String type) {
        switch (type.toLowerCase()) {
            case "car":
                return new Car();
            case "boat":
                return new Boat();
            default:
                throw new IllegalArgumentException("Неизвестный тип транспорта: " + type);
        }
    }
}

// Пример использования
public class Main {
    public static void main(String[] args) {
        VehicleFactory factory = new VehicleFactory();

        Vehicle car = factory.createVehicle("car");
        car.move();

        Vehicle boat = factory.createVehicle("boat");
        boat.move();
    }
}
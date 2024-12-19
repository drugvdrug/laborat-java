package main.lab6.fabric;

public class VehicleFactory {
    public Vehicle createVehicle(String type) {
        return switch (type.toLowerCase()) {
            case "car" -> new Car();
            case "boat" -> new Boat();
            default -> throw new IllegalArgumentException("Неизвестный тип транспорта: " + type);
        };
    }
}

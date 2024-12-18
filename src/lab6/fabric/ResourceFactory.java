package lab6.fabric;

public class ResourceFactory {
    public Resource createResource(String type) {
        return switch (type.toLowerCase()) {
            case "wood" -> new Wood();
            case "stone" -> new Stone();
            default -> throw new IllegalArgumentException("Неизвестный тип ресурса: " + type);
        };
    }
}
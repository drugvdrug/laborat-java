package lab6.flyweight;

public class CrystalType {
    private String color;
    private String shape;

    public CrystalType(String color, String shape) {
        this.color = color;
        this.shape = shape;
    }

    public String getColor() {
        return color;
    }

    public String getShape() {
        return shape;
    }
}
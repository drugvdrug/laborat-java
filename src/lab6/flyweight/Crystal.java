package lab6.flyweight;

public class Crystal {
    private CrystalType type;
    private int positionX;
    private int positionY;
    private int size;

    public Crystal(CrystalType type, int positionX, int positionY, int size) {
        this.type = type;
        this.positionX = positionX;
        this.positionY = positionY;
        this.size = size;
    }

    public void display() {
        System.out.println("Кристалл: " + type.getColor() + " " + type.getShape() +
                ", Позиция: (" + positionX + ", " + positionY + "), Размер: " + size);
    }
}
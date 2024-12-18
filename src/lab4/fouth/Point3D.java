package lab4.fouth;

public class Point3D extends Point {
    private int z;

    // Конструктор по умолчанию
    public Point3D() {
        super();
        this.z = 0;
    }

    // Конструктор с параметрами
    public Point3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    // Установка новых координат
    public void setLocation(int x, int y, int z) {
        super.setLocation(x, y);
        this.z = z;
    }

    // Получение координаты Z
    public int getZ() {
        return z;
    }

    // Масштабирование координат в трехмерном пространстве
    public void scale(double factor) {
        super.scale(factor);
        this.z = (int) (this.z * factor);
    }

    // Возвращает строку в виде "(x, y, z)"
    @Override
    public String toString() {
        return "(" + getX() + ", " + getY() + ", " + z + ")";
    }
}

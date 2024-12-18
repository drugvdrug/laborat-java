package main.lab4.third;

public class Point3D extends Point {
    private int z; // Координата Z

    // Конструктор по умолчанию
    public Point3D() {
        super(); // Вызов конструктора суперкласса
        this.z = 0;
    }

    // Конструктор с параметрами
    public Point3D(int x, int y, int z) {
        super(x, y); // Вызов конструктора суперкласса
        this.z = z;
    }

    // Установка новых координат
    public void setLocation(int x, int y, int z) {
        super.setLocation(x, y); // Установка координат X и Y
        this.z = z; // Установка координаты Z
    }

    // Установка новых координат с Z = 0
    @Override
    public void setLocation(int x, int y) {
        super.setLocation(x, y); // Установка координат X и Y
        this.z = 0; // Установка Z в 0
    }

    // Получение координаты Z
    public int getZ() {
        return z;
    }

    // Возвращает строку в виде "(x,y,z)"
    @Override
    public String toString() {
        return "(" + getX() + "," + getY() + "," + z + ")";
    }

    // Возвращает расстояние от начала координат
    @Override
    public double distanceFromOrigin() {
        return Math.sqrt(Math.pow(getX(), 2) + Math.pow(getY(), 2) + Math.pow(z, 2));
    }

    // Проверка, находится ли точка внутри трехмерного параллелепипеда
    public boolean isInBox(Point3D corner1, Point3D corner2) {
        return (getX() >= Math.min(corner1.getX(), corner2.getX()) &&
                getX() <= Math.max(corner1.getX(), corner2.getX()) &&
                getY() >= Math.min(corner1.getY(), corner2.getY()) &&
                getY() <= Math.max(corner1.getY(), corner2.getY()) &&
                z >= Math.min(corner1.getZ(), corner2.getZ()) &&
                z <= Math.max(corner1.getZ(), corner2.getZ()));
    }

    // Проверка, находится ли точка внутри сферы
    public boolean isInSphere(Point3D center, double radius) {
        double distance = Math.sqrt(Math.pow(getX() - center.getX(), 2) +
                Math.pow(getY() - center.getY(), 2) +
                Math.pow(z - center.getZ(), 2));
        return distance <= radius;
    }
}
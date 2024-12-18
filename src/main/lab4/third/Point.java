package main.lab4.third;

public class Point {
    private int x; // Координата X
    private int y; // Координата Y

    // Конструктор по умолчанию
    public Point() {
        this.x = 0;
        this.y = 0;
    }

    // Конструктор с параметрами
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Установка новых координат
    public void setLocation(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Получение координаты X
    public int getX() {
        return x;
    }

    // Получение координаты Y
    public int getY() {
        return y;
    }

    // Возвращает строку в виде "(x, y)"
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    // Возвращает расстояние от начала координат
    public double distanceFromOrigin() {
        return Math.sqrt(x * x + y * y);
    }

    // Проверка, находится ли точка внутри прямоугольника
    public boolean isInRectangle(Point topLeft, Point bottomRight) {
        return (x >= topLeft.getX() && x <= bottomRight.getX() &&
                y >= topLeft.getY() && y <= bottomRight.getY());
    }

    // Проверка, находится ли точка внутри окружности
    public boolean isInCircle(Point center, double radius) {
        double distance = Math.sqrt(Math.pow(x - center.getX(), 2) + Math.pow(y - center.getY(), 2));
        return distance <= radius;
    }
}
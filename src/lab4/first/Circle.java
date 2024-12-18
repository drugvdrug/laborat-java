package lab4.first;

public class Circle extends Figure {
    private double radius;

    // Конструктор
    public Circle(double radius) {
        this.radius = radius;
    }

    // Переопределение метода area
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
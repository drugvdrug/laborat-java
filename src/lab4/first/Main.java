package lab4.first;

public class Main {
    public static void main(String[] args) {
        Geometry geometry = new Geometry();

        // Добавляем фигуры
        geometry.addFigure(new Rectangle(5, 10));
        geometry.addFigure(new Triangle(4, 6));
        geometry.addFigure(new Circle(3));

        // Вычисляем общую площадь
        System.out.println("Общая площадь фигур: " + geometry.totalArea());
    }
}
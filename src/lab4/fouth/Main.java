package lab4.fouth;

public class Main {
    public static void main(String[] args) {
        // Создание точки 2D
        Point point2D = new Point(3, 4);
        System.out.println("Исходная 2D точка: " + point2D);
        point2D.scale(2);
        System.out.println("Масштабированная 2D точка: " + point2D);

        // Создание точки 3D
        Point3D point3D = new Point3D(3, 4, 5);
        System.out.println("Исходная 3D точка: " + point3D);
        point3D.scale(2);
        System.out.println("Масштабированная 3D точка: " + point3D);
    }
}
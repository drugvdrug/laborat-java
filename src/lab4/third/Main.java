package lab4.third;

public class Main {
    public static void main(String[] args)
    {
        // Создание точек
        Point point2D = new Point(3, 4);
        System.out.println("2D Point: " + point2D);
        System.out.println("Distance from origin: " + point2D.distanceFromOrigin());

        Point3D point3D = new Point3D(3, 4, 5);
        System.out.println("3D Point: " + point3D);
        System.out.println("Distance from origin: " + point3D.distanceFromOrigin());

        // Проверка нахождения в прямоугольнике
        Point topLeft = new Point(1, 1);
        Point bottomRight = new Point(5, 5);
        System.out.println("Point in rectangle: " + point2D.isInRectangle(topLeft, bottomRight));

        // Проверка нахождения в сфере
        Point3D center = new Point3D(0, 0, 0);
        double radius = 6;
        System.out.println("Point in sphere: " + point3D.isInSphere(center, radius));

        // Проверка нахождения в трехмерном параллелепипеде
        Point3D corner1 = new Point3D(1, 1, 1);
        Point3D corner2 = new Point3D(5, 5, 5);
        System.out.println("Point in box: " + point3D.isInBox(corner1, corner2));
    }
}

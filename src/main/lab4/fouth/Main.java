package main.lab4.fouth;

public class Main {
    public static void main(String[] args) {
        Point point = new Point(1, 0);
        point.display();
        point.rotate(90);
        point.display();

        Point3D point3D = new Point3D(1, 0, 0);
        point3D.display();
        point3D.rotateX(90);
        point3D.display();
        point3D.rotateY(90);
        point3D.display();
        point3D.rotateZ(90);
        point3D.display();
    }
}
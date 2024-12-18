package lab4.fouth;

class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void rotate(double angle) {
        double radians = Math.toRadians(angle);
        double cos = Math.cos(radians);
        double sin = Math.sin(radians);
        double newX = x * cos - y * sin;
        double newY = x * sin + y * cos;
        x = newX;
        y = newY;
    }

    public void display() {
        System.out.printf("Point: (%.2f, %.2f)%n", x, y);
    }
}

class Point3D extends Point {
    private double z;

    public Point3D(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    public double getZ() {
        return z;
    }

    public void rotateX(double angle) {
        double radians = Math.toRadians(angle);
        double cos = Math.cos(radians);
        double sin = Math.sin(radians);
        double newY = getY() * cos - z * sin;
        double newZ = getY() * sin + z * cos;
        z = newZ;
        // Обновляем y через сеттер
        setY(newY);
    }

    public void rotateY(double angle) {
        double radians = Math.toRadians(angle);
        double cos = Math.cos(radians);
        double sin = Math.sin(radians);
        double newX = getX() * cos + z * sin;
        double newZ = -getX() * sin + z * cos;
        z = newZ;
        // Обновляем x через сеттер
        setX(newX);
    }

    public void rotateZ(double angle) {
        rotate(angle);
    }

    public void display() {
        super.display();
        System.out.printf("Point3D: (%.2f, %.2f, %.2f)%n", getX(), getY(), z);
    }

    private void setX(double x) {
        // Используем рефлексию для установки значения x
        try {
            java.lang.reflect.Field field = Point.class.getDeclaredField("x");
            field.setAccessible(true);
            field.set(this, x);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void setY(double y) {
        // Используем рефлексию для установки значения y
        try {
            java.lang.reflect.Field field = Point.class.getDeclaredField("y");
            field.setAccessible(true);
            field.set(this, y);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

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
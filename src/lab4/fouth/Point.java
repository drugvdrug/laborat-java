package lab4.fouth;

public class Point {
    private int x;
    private int y;

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

    // Масштабирование координат относительно начала координат
    public void scale(double factor) {
        this.x = (int) (this.x * factor);
        this.y = (int) (this.y * factor);
    }

    // Возвращает строку в виде "(x, y)"
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
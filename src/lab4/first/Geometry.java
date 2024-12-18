package lab4.first;

import java.util.ArrayList;
import java.util.List;

public class Geometry {
    private List<Figure> figures;

    // Конструктор
    public Geometry() {
        figures = new ArrayList<>();
    }

    // Метод для добавления фигуры
    public void addFigure(Figure figure) {
        figures.add(figure);
    }

    // Метод для вычисления общей площади
    public double totalArea() {
        double total = 0;
        for (Figure figure : figures) {
            total += figure.area();
        }
        return total;
    }

    public List<Figure> getFigures() {
        return figures;
    }

    public void setFigures(List<Figure> figures) {
        this.figures = figures;
    }
}

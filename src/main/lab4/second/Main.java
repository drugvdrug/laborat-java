package main.lab4.second;

public class Main {
    public static void main(String[] args) {
        ComplexNumber complexNumber = new ComplexNumber(3, 4);
        complexNumber.display();

        ComplexNumber.PolarCoordinates polarCoordinates = complexNumber.toPolar();
        polarCoordinates.display();
    }
}

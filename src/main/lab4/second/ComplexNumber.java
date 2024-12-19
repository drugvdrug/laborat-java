package main.lab4.second;

public class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public PolarCoordinates toPolar() {
        double modulus = Math.sqrt(real * real + imaginary * imaginary);
        double argument = Math.atan2(imaginary, real);
        return new PolarCoordinates(modulus, argument);
    }

    public void display() {
        System.out.printf("Комплексное число: %.2f + %.2fi%n", real, imaginary);
    }

    public static class PolarCoordinates {
        private double modulus;
        private double argument;

        public PolarCoordinates(double modulus, double argument) {
            this.modulus = modulus;
            this.argument = argument;
        }

        public double getModulus() {
            return modulus;
        }

        public double getArgument() {
            return argument;
        }

        public void display() {
            System.out.printf("Полярные координаты: модуль = %.2f, аргумент = %.2f радиан%n", modulus, argument);
        }
    }
}
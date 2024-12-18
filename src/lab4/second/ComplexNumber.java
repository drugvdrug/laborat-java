package lab4.second;

public class ComplexNumber {
    private final double real; // Действительная часть
    private final double imaginary; // Мнимая часть

    // Конструктор для создания комплексного числа из действительной и мнимой частей
    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // Метод для преобразования из полярной формы в алгебраическую
    public static ComplexNumber fromPolar(double modulus, double argument) {
        double real = modulus * Math.cos(argument); // Действительная часть
        double imaginary = modulus * Math.sin(argument); // Мнимая часть
        return new ComplexNumber(real, imaginary);
    }

    // Метод для получения действительной части
    public double getReal() {
        return real;
    }

    // Метод для получения мнимой части
    public double getImaginary() {
        return imaginary;
    }

    // Переопределение метода toString для удобного отображения комплексного числа
    @Override
    public String toString() {
        if (imaginary >= 0) {
            return real + " + " + imaginary + "i";
        } else {
            return real + " - " + Math.abs(imaginary) + "i";
        }
    }

    // Пример использования
    public static void main(String[] args) {
        // Пример преобразования из полярной формы
        double modulus = 5; // Модуль
        double argument = Math.PI / 4; // Аргумент (угол в радианах)

        ComplexNumber complexNumber = ComplexNumber.fromPolar(modulus, argument);
        System.out.println("Комплексное число в алгебраической форме: " + complexNumber);
    }
}
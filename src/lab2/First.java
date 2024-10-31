package lab2;

import java.util.Random;

public class First {
    public static void main(String[] args) {
        int[] originalArray = new int[10]; // Определяем массив размером 10
        Random random = new Random();

        for (int i = 0; i < originalArray.length; i++) {
            originalArray[i] = random.nextInt(199) - 99; // Генерация случайного числа
        }

        System.out.println("Исходный массив:");
        printArray(originalArray);

        double[] reciprocalArray = createReciprocalFraction(originalArray);

        System.out.println("Массив обратных значений:");
        printArray(reciprocalArray);

        int[] uniqueArray = createUniqueArray(originalArray);

        System.out.println("Массив неповторяющихся элементов:");
        printArray(uniqueArray);
    }

    public static double[] createReciprocalFraction(int[] array) {
        double[] reciprocalArray = new double[array.length];
        for (int i = 0; i < array.length; i++) {
            reciprocalArray[i] = array[i] != 0 ? 1.0 / array[i] : Double.POSITIVE_INFINITY;
        }
        return reciprocalArray;
    }

    public static int[] createUniqueArray(int[] array) {
        int[] tempArray = new int[array.length];
        int uniqueCount = 0;

        for (int i = 0; i < array.length; i++) {
            boolean isUnique = true;
            for (int j = 0; j < uniqueCount; j++) {
                if (array[i] == tempArray[j]) {
                    isUnique = false; // Найден дубликат
                    break;
                }
            }
            if (isUnique) {
                tempArray[uniqueCount] = array[i];
                uniqueCount++;
            }
        }

        // Создаем финальный массив уникальных элементов
        int[] uniqueArray = new int[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            uniqueArray[i] = tempArray[i];
        }

        return uniqueArray;
    }

    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void printArray(double[] array) {
        for (double value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
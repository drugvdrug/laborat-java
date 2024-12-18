package main.lab2;

import java.util.Random;

public class Fourth {
    public static void main(String[] args) {
        int n = 5;
        int[][] matrix = new int[n][n];
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = random.nextInt(21);
            }
        }

        System.out.println("Матрица:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Вычисление среднего арифметического положительных элементов выше главной диагонали
        double sum = 0;
        int count = 0;
        int j = 0;

        for (int i = 1; i < n; i++) {
            sum += matrix[j][i];
            j++;
            count++;
        }

        double average;

        average = sum / count;
        System.out.println("Среднее арифметическое положительных элементов выше главной диагонали: " + average);
    }
}

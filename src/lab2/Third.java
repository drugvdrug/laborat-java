package lab2;

import java.util.ArrayList;
import java.util.Random;

public class Third {
    public static void main(String[] args) {
        int rows = 5;
        int cols = 5;
        int[][] matrix = new int[rows][cols];
        Random random = new Random();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = random.nextInt(10);
            }
        }

        int valueToExclude = 5;

        ArrayList<Integer> vectorBList = new ArrayList<>();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] != valueToExclude) {
                    vectorBList.add(matrix[i][j]);
                }
            }
        }

        int[] vectorB = new int[vectorBList.size()];
        for (int i = 0; i < vectorBList.size(); i++) {
            vectorB[i] = vectorBList.get(i);
        }

        System.out.println("Матрица:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Вектор B (элементы, не равные " + valueToExclude + "):");
        for (int value : vectorB) {
            System.out.print(value + " ");
        }
    }
}

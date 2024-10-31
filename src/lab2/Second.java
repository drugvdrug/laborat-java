package lab2;

import java.util.Arrays;

public class Second {
    public static void main(String[] args) {
        int[] b = {1, -2, 3, -4, 5, -6, 7, -8, 9, -10};
        int[] c = transferNegativeNumbers(b);
        selectionSort(c);
        System.out.println(Arrays.toString(c));
    }

    public static int[] transferNegativeNumbers(int[] b) {
        int count = 0;
        for (int i = 0; i < b.length; i++) {
            if (b[i] < 0) {
                count++;
            }
        }
        int[] c = new int[count];
        int index = 0;
        for (int i = 0; i < b.length; i++) {
            if (b[i] < 0) {
                c[index] = b[i];
                index++;
            }
        }
        return c;
    }

    public static void selectionSort(int[] c) {
        for (int i = 0; i < c.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < c.length; j++) {
                if (c[j] < c[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = c[minIndex];
            c[minIndex] = c[i];
            c[i] = temp;
        }
    }
}

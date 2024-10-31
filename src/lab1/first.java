package lab1;

import java.util.Scanner;

public class first {
    public static void main(String[] args) {
        System.out.println("Задание 1");

        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();

        if (x < y) {
            x = x / 2;
            System.out.println(x);
        }
        else {
            y = y / 2;
            System.out.println(y);
        }
    }
}

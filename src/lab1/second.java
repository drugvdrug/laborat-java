package lab1;

import java.util.Scanner;
import java.lang.Math;

public class second {
    public static void main(String[] args) {
        System.out.println("Задание 2");

        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();

        double d = Math.cos(Math.max(a, b));

        System.out.println(d);
    }
}

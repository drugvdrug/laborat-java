package main.lab1;

import java.util.Scanner;
import java.lang.Math;

public class third {
    public static void main(String[] args) {
        System.out.println("Задание 3");


        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();

        double Y, F;

        if (x <= -3) {
            Y = Math.pow(x, 3) + 1;
            F = Math.pow(Math.E, x + 1);
        }
        else if (x > -3 && x <= 0) {
            Y = 1 + Math.pow(2, Math.tan(x));
            F = Math.pow(x, 4);
        }
        else {
            Y = Math.pow(Math.cos(x)/Math.sin(x), 2);
            F = Math.pow(Math.tan(x), 1.0 / 5.0);
        }
        System.out.println(Y);
        System.out.println(F);
    }
}

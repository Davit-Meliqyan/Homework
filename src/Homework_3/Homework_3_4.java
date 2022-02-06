package Homework_3;

import java.util.Scanner;

public class Homework_3_4 {

    public static void main(String[] args) {

        System.out.println("input radius");
        Scanner scanner = new Scanner(System.in);
        double radius = scanner.nextDouble();
        double area = Math.PI * Math.pow(radius,2);
        System.out.println("area " + area);
    }
}

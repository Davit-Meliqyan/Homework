package homework_2;

import java.util.Scanner;

public class Homework_2_5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("insert first number");
        int num1 = scanner.nextInt();
        System.out.println("insert second number");
        int num2 = scanner.nextInt();
        System.out.println("insert third number");
        int num3 = scanner.nextInt();

        int sum = num1 + num2 + num3;
        System.out.println("sum of numbers " + sum);

        int average = sum / 3;
        System.out.println("average of numbers " + average);
    }
}

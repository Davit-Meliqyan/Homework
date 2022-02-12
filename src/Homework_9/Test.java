package Homework_9;

import java.util.Scanner;

public class Test {

    public static String signOfNumber1(int num) {

        String sing = "negative";
        if (num > 0) {
            sing = "positive";
        }
        return sing;
    }

    public static String signOfNumber2(int num) {

        String sing = "zero";
        if (num > 0) {
            sing = "positive";
        }
        if (num < 0) {
            sing = "negative";
        }
        return sing;
    }

    public static boolean isPower2(double a) {
        boolean bool = false;
        for (double i = a; i >= 0.5; i = i / 2) {

            if (i == 0.5) {
                bool = true;
            }
        }
        return bool;

    }

    public static boolean isPower2Bit(int a) {
        int b = a | a - 1;
        if (b == 2 * a - 1) return true;
        return false;

    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
//        System.out.println("input number");
//        int num = scanner.nextInt();
//        System.out.println(signOfNumber1(num));
//        System.out.println("input number");
//        int number = scanner.nextInt();
//        System.out.println(signOfNumber2(number));

//        int a = scanner.nextInt();
//        System.out.println(isPower2(a));
        int a = scanner.nextInt();


        System.out.println(a + " " + isPower2Bit(a));

    }
}

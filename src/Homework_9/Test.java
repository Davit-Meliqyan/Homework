package Homework_9;

import java.util.Scanner;

public class Test {

    public static void compareVariables1(String str1, String str2) {
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));
    }

    public static void compareVariables2() {
        String str1 = "String";
        String str2 = new String("Sting");
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));
    }

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

    public static double usingTernary(double a, double b) {

        return a > 0 ? Math.max(a, b) : Math.abs(a);
    }


    public static int checkString(String str) {

        int result = str == null ? -1 : str.equals("") ? 0 : 1;
        return result;
    }

    public static int max(int a, int b, int c) {
        System.out.println("Largest Number:");
        return c > (a > b ? a : b) ? c : ((a > b) ? a : b);
    }

    public static void correctAnswer(int i) {
        switch (i) {
            case 1:
            case 3:
            case 4:
                System.out.println("Invalide choice");
                break;
            case 2:
                System.out.println("Congratulation");
                break;

        }
    }

    public static boolean switchVowel(char c) {

        switch (c) {
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                return true;


            default:
                return false;
        }

    }

    public static String switchNumber(int num) {
        String res;
        switch (num) {
            case 0:
                res = "0";
                break;
            case 1:
                res = "1";
                break;
            case 2:
                res = "2";
                break;
            case 3:
                res = "3";
                break;
            case 4:
                res = "4";
                break;
            case 5:
                res = "5";
                break;
            case 6:
                res = "6";
                break;
            case 7:
                res = "7";
                break;
            case 8:
                res = "8";
                break;
            case 9:
                res = "9";
                break;


            default:
                res = "Not allowed";
        }
        return res;
    }

    public static void switchEven(int num) {

        switch (num % 2) {
            case 0:
                System.out.println(num + " is a Even number");
                break;
            case 1:
                System.out.println(num + " is a Odd number");
        }
    }


    public static boolean isPower2(double a) {
        boolean bool = false;
        for (double i = a; i >= 0.5; i = i / 2) {

            if (i == 0.5) {
                bool = true;
                break;
            }
        }
        return bool;

    }

    public static boolean isPower2Bit(int a) {
        int b = a | a - 1;
        return b == 2 * a - 1;

    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
//        System.out.println("Input string");
//        String st = scanner.nextLine();
//        System.out.println(checkString(st));
//        System.out.println("Input str1");
//        String str1 = scanner.nextLine();
//        System.out.println("Input str2");
//        String str2 = scanner.nextLine();
//        compareVariables1(str1, str2);
//        compareVariables2();
//        System.out.println("input number");
//        int num = scanner.nextInt();
//        System.out.println(signOfNumber1(num));
//        System.out.println("input number");
//        int number = scanner.nextInt();
//        System.out.println(signOfNumber2(number));

//        double a = scanner.nextDouble();
//        double b = scanner.nextDouble();
//        System.out.println(usingTernary(a, b));
//        System.out.println("Enter all three numbers:");
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//        int c = scanner.nextInt();
//        System.out.println(max(a, b, c));
//
//        System.out.println("Input answer number");
//        int i = scanner.nextInt();
//        correctAnswer(i);

//        System.out.println("input charset");
//        char c = scanner.next().charAt(0);
//        if (switchVowel(c) == true) {
//            System.out.println(c + " is a Vowel");
//        } else {
//            System.out.println(c + " is  not a Vowel");
//        }

//        System.out.println("Input number");
//        int num = scanner.nextInt();
//        System.out.println(switchNumber(num));
//
//        System.out.println("Input number");
//        int number = scanner.nextInt();
//        switchEven(number);


//        int a = scanner.nextInt();
//        System.out.println(isPower2(a));
//        int a = scanner.nextInt();
//        System.out.println(isPower2Bit(a));

//        System.out.println("Input String Variable");
//        String str = scanner.nextLine();
//        System.out.println(checkString(""));



    }
}

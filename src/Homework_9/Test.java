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

        return num > 0 ?
                "positive":
                "negative" ;
    }

    public static String signOfNumber2(int num) {
        return num != 0 ?
                num > 0 ?
                        "positive" :
                        "negative" :
                "zero";
    }

    public static int maxTernary(int a, int b) {

        return a > b ? a : b;
    }

    public static int abcTernary(int a) {

        return a < 0 ? a * -1 : a;
    }


    public static int checkString(String str) {

        return str == null ? -1 : str.equals(" ") ? 0 : 1;
    }

    public static int max(int a, int b, int c) {
        System.out.println("Largest Number:");
        return (a > b) ?
                ((a > c) ? a : c) :
                ((b > c) ? b : c);
    }

    public static int max1(int a, int b, int c) {
        System.out.println("Largest Number:");
        return maxTernary(a, maxTernary(a, b));
    }

    public static void checkAnswer(char ch) {
        switch (ch) {
            case 'b':
                System.out.println("Congratulation");
                break;
            case 'a':
            case 'c':
            case 'd':
                System.out.println("Invalid choice");
                break;
            default:
                System.out.println("Illegal input");
                break;


        }
    }

    public static void showQuiz() {
        System.out.println("What is the correct way to declare a variable to store an integer value in Java?\n" +
                "a. int 1x=10;\n" +
                "b. int x=10;\n" +
                "c. float x=10.0f;\n" +
                "d. string x=&quot;10&quot;");
    }

    public static void checkVowelConsonant(char c) {
        if (!((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))) {
            System.err.printf("Provided character %c is not a letter\n", c);
            return;
        }

        switch (c) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println(c + "is a Vowel");
                break;

            default:
                System.out.println(c + "is a Consonant");
                break;
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

    public static void calculator(int a, int b, char op) {

    }

    public static void determineGrade(int quizScore, int midScore, int finalScore) {
        int avg = (quizScore + midScore + finalScore) / 3;
        switch (avg / 20) {
            case 5:
            case 4:
                System.out.println("A");
                break;
            case 3:
                System.out.println("B");
                break;
            case 2:
                System.out.println("C");
                break;
            default:
                System.out.println("F");
                break;
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


//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//        System.out.println(maxTernary(a, b));

//        int x = scanner.nextInt();
//        System.out.println(abcTernary( x));

//        String str = scanner.nextLine();
//        System.out.println(checkString(str));

//        System.out.println("Enter all three numbers:");
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//        int c = scanner.nextInt();
//        System.out.println(max(a, b, c));
//
//        showQuiz();
//        System.out.println("Enter your choice: ");
//        char ch = scanner.next().charAt(0);
//        checkAnswer(ch);

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

//        System.out.println("Enter quizScore");
//        int quizScore = scanner.nextInt();
//        System.out.println("Enter midScore");
//        int midScore = scanner.nextInt();
//        System.out.println("Enter finalScore");
//        int finalScore = scanner.nextInt();
//        System.out.print("Your grade is ");
//        determineGrade(quizScore, midScore, finalScore);

//        int a = scanner.nextInt();
//        System.out.println(isPower2(a));

//        int a = scanner.nextInt();
//        System.out.println(isPower2Bit(a));

//        System.out.println("Input String Variable");
//        String str = scanner.nextLine();
//        System.out.println(checkString(""));


    }
}

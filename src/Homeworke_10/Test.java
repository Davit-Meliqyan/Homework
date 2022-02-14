package Homeworke_10;

import java.util.Random;
import java.util.Scanner;

import static Homework_9.Test.isPower2Bit;

public class Test {

    public static void printNumbers() {
        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
    }

    public static void printEvenNumbers() {
        int i = 1;
        while (i <= 20) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }
    }

    public static boolean squares(int a) {
        int i = 1;
        while (i <= a / 2 + 1) {
            if (a / i == i && a % i == 0) {
                return true;
            }
            i++;
        }
        return false;
    }

    public static void printSquaresOfNaturalNumbers(int n) {

        if (n > 0) {
            int m = 1;
            while (m <= n) {

                if (squares(m)) {
                    System.out.println(m);

                }
                m++;

            }
        } else {
            System.err.println("number is negative");
        }
    }

    public static void smallestNaturalDivisor(int n) {
        if (n > 2) {
            int divisor = 2;
            while (divisor <= n) {
                if (n % divisor == 0) {
                    System.out.println("smallest natural divisor " + divisor);
                    break;
                } else {
                    divisor++;
                }
            }
        } else {
            System.err.println("number is not great 2");
        }
    }


    public static void printPowersOfTwo(int n) {
        int i = 1;
        while (i <= n) {
            if (isPower2Bit(i)) {
                System.out.println(i);
            }
            i++;
        }
    }

    public static void printAllIntegersInDescendingOrder(int n) {

        while (n >= 0) {
            System.out.println(n);
            n--;
        }
    }

    public static void multipleOf2InDescendingOrder(int n) {
        while (n > 1) {
            if (n % 2 == 0) {
                System.out.println(n);
            }
            n--;
        }
    }

    public static void exactPowerOf() {
        Scanner scanner = new Scanner(System.in);
        int count = 1;
        while (true) {
            System.out.println("input number");
            int n = scanner.nextInt();
            if (isPower2Bit(n)) {
                System.out.println("N = " + n);
                System.out.println("count = " + count);
                break;
            }
            count++;
        }
    }

    public static int smallestK(int n) {
        int i = 1;
        int count = 0;
        while (i <= n) {
            i *= 2;
            count++;
        }
        return count;
    }

    public static void printTheTableOfChar() {
        int i = 32;
        while (i < 123) {
            int a = 0;
            while (a < 10) {
                System.out.print((char) i + " ");
                a++;
                i++;
            }
            System.out.println();
        }
    }

    public static void notMultipleOf3(int n) {
        int i = 1;
        while (i <= n) {
            if (i % 3 != 0) {
                System.out.println(i);
            }
            i++;
        }
    }

    public static int nFibonacci(int f) {
        int a = 0;
        int b = 1;
        int count = 0;
        while (b <= f) {
            b += a;
            a = b - a;
            count++;
        }
        //System.out.println(a+" "+b+" "+count);
        if (a == f) {
            return count;
        } else return -1;
    }

    public static int athleteRan(double x, double y) {
        int count = 1;
        while (x <= y) {
            x = x + x / 10;
            count++;
        }
        return count;
    }

    public static int sequence() {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int res = 0;
        while (true) {
            System.out.println("input number");
            int n = scanner.nextInt();
            if (n == 0) {
                return res;
            }
            count++;
            if (count == 2) {
                res = n;
            }
        }
    }

    public static void quiz() {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int myNum = random.nextInt(100);
        while (true) {
            System.out.println("input number");
            int n = scanner.nextInt();
            if (n == myNum) {
                System.out.println("Yes, you guessed the number");
                break;
            } else if (n < myNum) {
                System.out.println("Too high, try again");
            } else {
                System.out.println("Too low, try again");
            }
        }
    }

    public static int sumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//        printNumbers();

//        printEvenNumbers();

//        System.out.println("input N");
//        int n = scanner.nextInt();
//        printSquaresOfNaturalNumbers(n);

//        System.out.println("input number");
//        int num = scanner.nextInt();
//        smallestNaturalDivisor(num);

//        System.out.println("input N");
//        int number = scanner.nextInt();
//        printPowersOfTwo(number);

//        System.out.println("input N");
//        int a = scanner.nextInt();
//        printAllIntegersInDescendingOrder(a);

//        System.out.println("input N");
//        int b = scanner.nextInt();
//        multipleOf2InDescendingOrder(b);

//        exactPowerOf2();

//        System.out.println("input N");
//        int c = scanner.nextInt();
//        System.out.println(smallestK(c));

//        printTheTableOfChar();

//        System.out.println("input N");
//        int d = scanner.nextInt();
//        notMultipleOf3(d);

//        System.out.println("input N");
//        int f = scanner.nextInt();
//        System.out.println(nFibonacci(f));

//        System.out.println("input x");
//        int x = scanner.nextInt();
//        System.out.println("input y");
//        int y = scanner.nextInt();
//        System.out.println(athleteRan(x,y));

//        System.out.println(sequence());


//        quiz();

//        System.out.println("input number");
//        int z = scanner.nextInt();
//        System.out.println(sumOfDigits(z));


    }
}

package Homework_11;

import java.util.Scanner;

import static Homework_10.Test.*;


public class Test {

    public static void evenNumbers(int first, int second) {
        for (int i = first; i <= second; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    public static void printSquares(int a, int b) {
        for (int i = a; i <= b; i++) {
            if (squares(i)) {
                System.out.println(i);
            }
        }
    }

    public static int dOccursX(int x, int d) {
        int count = 0;
        for (int i = x; i > 0; i /= 10) {
            if (i % 10 == d) {
                count++;
            }
        }
        return count;
    }

    public static void reverseDigits(int num) {
        for (int i = num; i >= 0; i /= 10) {
            if (i % 10 != 0) {
                System.out.println(i % 10);
            }
        }
    }

    public static int smallestNaturalDivisor(int x) {
        if (x >= 2 && x <= 30000) {
            int d = 0;
            for (int i = 2; i <= x; i++) {
                if (x % i == 0) {
                    d = i;
                    break;
                }
            }
            return d;
        } else {
            return -1;
        }
    }

    public static void allDivisors(int number) {
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.println(i);
            }
        }
    }

    public static int countDivisors(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        return count;
    }

    public static int sumNumbers() {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("input number");
            int num = sc.nextInt();
            sum += num;
        }
        return sum;
    }

    public static int binToDec(int bin) {
        int dec = 0;
        int count = 0;
        for (int i = bin; i > 0; i /= 10) {
            int k = 1;
            for (int j = 0; j < count; j++) {
                k *= 2;
            }
            dec += (i % 10) * k;
            count++;
        }
        return dec;
    }

    public static void countNumbers(int n) {
        Scanner sc = new Scanner(System.in);
        int countZ = 0;
        int countP = 0;
        int countN = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("input number");
            int number = sc.nextInt();
            if (number == 0) {
                countZ++;
            } else if (number > 0) {
                countP++;
            } else {
                countN++;
            }
        }
        System.out.println("number of zeros: " + countZ + " number of positive: " + countP + " number of negative: " + countN);
    }

    public static void emulator(int n) {
        int count = 1;
        for (int i = 1; i <= n; ) {

            if (i >= count) {
                System.out.print(i);
                count++;
                i++;
            } else {
                i++;
            }
        }
    }

    public static void twoForLoops(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void checkerboard(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2 * n; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void multiplicationTable(int n) {
        for (int i = 0; i < (n + 2); i++) {
            for (int j = 0; j < (n + 2); j++) {
                if (i == 0 && j == 0) {
                    System.out.printf("%4s", "  * ");
                } else if (i == 1) {
                    System.out.printf("%4s", "----");
                } else if (j == 1 ) {
                    System.out.printf("%4s", "   |");
                } else if (i == 0) {
                    System.out.printf("%4s", j - 1);
                } else if (j == 0) {
                    System.out.printf("%4s", i - 1);
                } else {
                    System.out.printf("%4s", (i - 1) * (j - 1));
                }

            }
            System.out.println();
        }
    }


    public static void table(int n) {
        String st = "*";
        int k = 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j % 2 == 1) {
                    k = 5 - k;
                    if (j < 2) {
                        for (int x = 1; x <= k; x++) {
                            System.out.print("*");
                        }
                        for (int x = 1; x <= 5 - k; x++) {
                            System.out.print(" ");
                        }
                    } else {
                        for (int x = 1; x <= 5 - k; x++) {
                            System.out.print(" ");
                        }
                        for (int x = 1; x <= k; x++) {
                            System.out.print("*");
                        }
                    }
                } else {
                    if (j >= 2) {
                        for (int x = 1; x <= 5 - k; x++) {
                            System.out.print(" ");
                        }
                        for (int x = 1; x <= k; x++) {
                            System.out.print("*");
                        }
                    } else {
                        for (int x = 1; x <= k; x++) {
                            System.out.print("*");
                        }
                        for (int x = 1; x <= 5 - k; x++) {
                            System.out.print(" ");
                        }
                    }
                }

            }
            System.out.println();
            k++;
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//        System.out.println("input first number");
//        int first = scanner.nextInt();
//        System.out.println("input second number");
//        int second = scanner.nextInt();
//        evenNumbers(first, second);

//        System.out.println("input first number");
//        int a = scanner.nextInt();
//        System.out.println("input second number");
//        int b = scanner.nextInt();
//        printSquares(a,b);

//        System.out.println("input x");
//        int x = scanner.nextInt();
//        System.out.println("input d");
//        int d = scanner.nextInt();
//        System.out.println(dOccursX(x,d));

//        System.out.println("input number");
//        int num = scanner.nextInt();
//        reverseDigits(num);

//        System.out.println("input x");
//        int x = scanner.nextInt();
//        System.out.println(smallestNaturalDivisor(x));

//        System.out.println("input x");
//        int x = scanner.nextInt();
//        allDivisors(x);

//        System.out.println("input x");
//        int x = scanner.nextInt();
//        System.out.println(countDivisors(x));

//        System.out.println(sumNumbers());

//        System.out.println("input binary number");
//        int bin = scanner.nextInt();
//        System.out.println(binToDec(bin));

//        System.out.println("input n");
//        int n = scanner.nextInt();

//        countNumbers(n);

        //emulator(10);

//        twoForLoops(10);

//        System.out.println("input n");
//        int n = scanner.nextInt();
//        checkerboard(n);

//        multiplicationTable(31);

//       table(64);
//


    }
}

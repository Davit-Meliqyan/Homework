package Homework_16;

import java.util.Scanner;


public class Test {

    public static int powTwo(int n) {
        int a = 1;
        for (int i = 0; i < n; i++) {
            a *= 2;
        }
        return a;
    }

    public static void day(int n) {
        System.out.println((n / 60) % 24 + " hours");
        System.out.println(n % 60 + " minutes");
    }

    static boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void palindrome(int start, int end) {
        for (int i = start; i < end; i++) {
            if ((i % 100) / 10 == (i % 1000) / 100 && i / 1000 == i % 10) {
                System.out.println(i);
            }
        }
    }


    public static StringBuilder word(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(String.valueOf(s.charAt(0)).toUpperCase());
        for (int i = 1; i < s.length(); i++) {
            stringBuilder.append(("" + s.charAt(i)).toLowerCase());
        }
        return stringBuilder;
    }

    public static char[][] oAndX(int n) {
        char[][] matrix = new char[n][n];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if ((i + j) % 2 == 0) {
                    matrix[i][j] = 'O';
                } else {
                    matrix[i][j] = 'X';
                }
            }
        }
        return matrix;
    }

    public static void printMatrix(char[][] matrix) {
        for (char[] chars : matrix) {
            for (char aChar : chars) {
                System.out.printf("%4s", aChar);
            }
            System.out.println();
        }
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] chars : matrix) {
            for (int aChar : chars) {
                System.out.printf("%4s", aChar);
            }
            System.out.println();
        }
    }

    public static void geometricProgression(double b, double q, int n) {
        for (int i = 1; i < n; i++) {
            b *= q;
        }
        System.out.printf("%.2f", b);
    }

    public static void primeFactors(int n) {
        int i = 2;
        while (i <= n / 2) {
            while (n % i == 0) {
                System.out.print(i);
                if (n / i != 1) {
                    System.out.print(" * ");
                }
                n /= i;
            }
            i++;
        }
        if (n != 1) {
            System.out.print(n);
        }
    }

    public static int[][] multiplicationTable(int n, int m) {
        int[][] matrix = new int[n][m];
        int i = 1;
        for (int j = 0; j < n * m - m; j++) {
            matrix[i][j % m] += (j % m) * i;
            if (j % m == 0 && j > 0) {
                i++;
            }
        }
        return matrix;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        String s = scanner.nextLine();
//        double b = scanner.nextDouble();
//        double q = scanner.nextDouble();
//        int n = scanner.nextInt();

//        System.out.println(powTwo(n));

//        day(n);
//
//        System.out.println(isPrime(5));

//        palindrome(1000,9999);

//        System.out.println(word(s));

//        primeFactors(n);

//        printMatrix(oAndX(n));

//        geometricProgression(b, q, n);

        printMatrix(multiplicationTable(11, 11));


    }
}

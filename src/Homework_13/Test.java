package Homework_13;

import java.util.Scanner;

public class Test {

    public static int[][] matrixInit(int[][] matrix) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        return matrix;
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%4s", matrix[i][j]);
            }
            System.out.println();
        }
    }

    public static void mainDiagonal(int n) {
        int[][] matrix = new int[n][n];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i + j == n - 1) {
                    matrix[i][j] = 1;
                }
                System.out.printf("%3s", matrix[i][j]);
            }
            System.out.println();
        }
    }

    public static void diagonal(int n) {
        int[][] matrix = new int[n][n];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i + j == matrix.length - 1) {
                    matrix[i][j] = 1;
                } else if (j + i > matrix.length) {
                    matrix[i][j] = 2;
                }
                System.out.printf("%3s", matrix[i][j]);
            }
            System.out.println();
        }
    }

    public static boolean isSymmetrical(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] != matrix[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void athletes1(int[][] matrix) {
        int sum = 0;
        int maxSum = 0;
        int index = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
            if (sum > maxSum) {
                maxSum = sum;
                index = i;
            }
            sum = 0;
        }
        System.out.println(maxSum + " " + index);
    }

    public static void athletes2(int[][] matrix) {
        int maxSum = 0;
        int indexI = 0;
        int indexJ = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > maxSum) {
                    maxSum = matrix[i][j];
                    indexI = i;
                    indexJ = j;
                }
            }
        }
        System.out.println(maxSum);
        System.out.println(indexI + " " + indexJ);
    }

    public static void athletes3(int[][] matrix) {
        int max = 0;
        int maxLine = 0;
        int index = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (max < matrix[i][j]) {

                    max = matrix[i][j];

                }
                if (max > maxLine) {

                    maxLine = max;
                    index = i;
                }
            }
        }
        System.out.println(index);
    }

    public static void addMatrix(int[][] a, int[][] b) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.printf("%3s", a[i][j] * b[i][j]);
            }
            System.out.println();
        }
    }


    public static int[][] revers180(int[][] matrix) {
        int k = matrix.length;
        int temp = 0;
        for (int i = 0; i < matrix.length; i++) {
            if (i >= matrix.length / 2) {
                k = matrix.length / 2 + 1;
            }
            for (int j = 0; j + i < k; j++) {
                temp = matrix[i][j];
                matrix[i][j] = matrix[matrix.length - i - 1][matrix[i].length - j - 1];
                matrix[matrix.length - i - 1][matrix[i].length - j - 1] = temp;
            }
        }
        return matrix;

    }

        public static int[][] spiralMatrix (int n) {

            int[][] matrix = new int[n][n];

            int startingPointI = 0;
            int startingPointJ = 1;

            int l = n / 4 + n % 4;
            while (l > 0) {

                for (int j = startingPointJ; j < matrix[startingPointI].length; j++) {
                    if (matrix[startingPointI][j] == 1) {
                        startingPointI++;
                        startingPointJ--;
                        break;
                    }
                    matrix[startingPointI][j - 1] = 1;
                    startingPointJ = j;
                }
                startingPointI++;
                for (int i = startingPointI; i < matrix.length; i++) {
                    if (matrix[i][startingPointJ] == 1) {
                        startingPointI--;
                        startingPointJ--;
                        break;
                    }
                    matrix[i - 1][startingPointJ] = 1;
                    startingPointI = i;
                }
                startingPointJ--;
                for (int j = startingPointJ; j >= 0; j--) {
                    if (matrix[startingPointI][j] == 1) {
                        startingPointI--;
                        startingPointJ++;
                        break;
                    }
                    matrix[startingPointI][j + 1] = 1;
                    startingPointJ = j;
                }
                startingPointI--;
                for (int i = startingPointI; i >= 0; i--) {
                    if (matrix[i][startingPointJ] == 1) {
                        startingPointI++;
                        startingPointJ++;
                        break;
                    }
                    matrix[i + 1][startingPointJ] = 1;
                    startingPointI = i;
                }
                startingPointJ++;
                l--;
            }

            return matrix;
        }

        public static int[][] spiralMatrixSimple () {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();

            int[][] matrix = new int[2 * n + 1][2 * n + 1];

            int startingPointI = 0;
            int startingPointJ = 2;

            int count = 1;

            int l = n + 1;
            while (l > 0) {
                for (int j = startingPointJ; j < matrix[startingPointI].length; j++) {
                    if (matrix[startingPointI][j] > 0) {
                        break;
                    }
                    matrix[startingPointI][j - 1] = count;
                    count++;
                    startingPointJ = j;
                }
                startingPointI++;
                for (int i = startingPointI; i < matrix.length; i++) {
                    if (matrix[i][startingPointJ] > 0) {
                        break;
                    }
                    matrix[i - 1][startingPointJ] = count;
                    count++;
                    startingPointI = i;
                }
                startingPointJ--;
                for (int j = startingPointJ; j >= 0; j--) {
                    if (matrix[startingPointI][j] > 0) {
                        break;
                    }
                    matrix[startingPointI][j + 1] = count;
                    count++;
                    startingPointJ = j;
                }
                startingPointI--;
                for (int i = startingPointI; i > 0; i--) {
                    if (matrix[i][startingPointJ] > 0) {
                        break;
                    }
                    matrix[i + 1][startingPointJ] = count;
                    count++;
                    startingPointI = i;
                }
                startingPointJ++;
                l--;
            }
            matrix[n][n] = count;

            return matrix;
        }

        public static void main (String[]args){

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

//        int m = scanner.nextInt();

//        mainDiagonal(n);
//        {{1, 2, 3,4}, {5, 6,7,8}, { 9,10,11,12},{13,14,15,16}};

            //       int[][] matrix = new int[n][m];


//        int[][] matrix2D = matrixInit(matrix);
//        printMatrix(matrix2D);

//        diagonal(n);

//        System.out.println(isSymmetrical(matrix2D));

//        athletes1(matrix2D);

//        athletes2(matrix2D);

//        athletes3(matrix2D);

//        int[][]  a = matrixInit(matrix);
//        int[][]  b = matrixInit(matrix);
//
//        addMatrix(a,b);

            printMatrix(spiralMatrix(n));

//            printMatrix(spiralMatrixSimple());

//        revers180(matrix2D);

        }
    }

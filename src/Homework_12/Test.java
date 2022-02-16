package Homework_12;

import java.sql.Array;
import java.util.Scanner;

public class Test {

    public static void printEvenIndex(int[] arr) {
        for (int i = 0; i < arr.length; i += 2) {
            System.out.println(arr[i] + " ");
        }
    }


    public static void printEvenElements(int[] arr) {
        for (int e : arr) {
            if (e % 2 == 0) {
                System.out.println(e + " ");
            }
        }
    }

    public static void printPositiveElements(int[] arr) {
        int count = 0;
        for (int e : arr) {
            if (e > 0) {
                System.out.print(e + " ");
                count++;
            }
        }
        System.out.println();
        System.out.println(count);
    }

    public static void printNextLargerElement(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] > arr[i]) {
                System.out.print(arr[i] + " ");
            }
        }
    }

    public static void printSameSing(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] * arr[i] > 0) {
                System.out.print(arr[i - 1] + " " + arr[i]);
                break;
            }
        }
    }

    public static void maxElementAndIndex(int[] arr) {
        int max = arr[0];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                count = i;
            }
        }
        System.out.println(max);
        System.out.println(count);
    }

    public static void printSmallestPosElement(int[] arr) {
        int min = arr[0];
        for (int e : arr) {
            if (e < min && e > 0) {
                min = e;
            }
        }
        System.out.println(min);
    }

    public static void differentElementsCount(int[] arr) {
        int count = 1;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static void reverseElement(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length / 2; i++) {
            temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
        for (int e : arr) {
            System.out.print(e + " ");
        }
    }

    public static void reverseElementWhitArray(int[] arr) {
        int[] array = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            array[i] = arr[arr.length - i - 1];
        }
        for (int e : array) {
            System.out.print(e + " ");
        }
    }

    public static void rearrangeAdjacentElements(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length; i += 2) {
            if (i + 1 != arr.length) {
                temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
        for (int e : arr) {
            System.out.print(e + " ");
        }
    }


    public static void cycleRight(int[] arr) {
        int[] array = new int[arr.length];
        for (int i = 0; i < arr.length ; i++) {
            array[i] = arr[(i+arr.length-1)%array.length];
        }
        for (int e : array) {
            System.out.print(e + " ");
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

//        printEvenIndex(arr);

//        printEvenElements(arr);

//        printPositiveElements(arr);

//        printNextLargerElement(arr);

//        printSameSing(arr);

//        maxElementAndIndex(arr);

//        printSmallestPosElement(arr);

//        differentElementsCount(arr);

//        reverseElement(arr);

//        reverseElement(arr);

//        rearrangeAdjacentElements(arr);

//        cycleRight(arr);


    }
}

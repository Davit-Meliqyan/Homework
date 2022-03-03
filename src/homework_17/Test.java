package Homework_17;

public class Test {
    //--------------------------------------------------------------------------------1,2,3
    public static void add(int a, int b) {

    }

    public static void add(int a, int b, int c) {

    }

    public static void add(int a, float b) {

    }

    public static void add(float b, int a) {

    }

    //--------------------------------------------------------------------------------4
    public static void print(int[] a) {
        System.out.print("[ " + a[0]);
        for (int e : a) {
            System.out.print(", " + e);
        }
        System.out.print(" ]");
    }

    public static void print(double[] a) {
        System.out.print("[ " + a[0]);
        for (double e : a) {
            System.out.print(", " + e);
        }
        System.out.print(" ]");
    }

    public static void print(float[] a) {
        System.out.print("[ " + a[0]);
        for (float e : a) {
            System.out.print(", " + e);
        }
        System.out.print(" ]");
    }

    //--------------------------------------------------------------------------------5
    public static int search(int[] array) {
        return array.length;
    }

    public static int search(int[] array, int a) {
        if (a >= 0 && a < array.length) {
            return array[a];
        } else {
            return -1;
        }
    }

    public static boolean search(int[] array, int argument, int index) {
        return index >= 0 && index < array.length && array[index] == argument;
    }

    //--------------------------------------------------------------------------------6
    public static double square(int a) {
        return Math.PI * Math.pow(a, 2);
    }

    public static double square(float a) {
        return Math.pow(a, 2);
    }

    public static double square(int a, int b) {
        return a * b;
    }
    //--------------------------------------------------------------------------------7

    public static double max(int a, int b) {
        return Math.max(a, b);
    }

    public static double max(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    public static double max(int a, int b, int c, int d) {
        return Math.max(Math.max(a, b), Math.max(c, d));
    }

    //--------------------------------------------------------------------------------8
    public static double distance(int x1, int x2) {
        return Math.sqrt(Math.pow(x1, 2) + Math.pow(x2, 2));
    }

    public static double distance(int x1, int x2, int x3, int x4) {
        return Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(x2 - x4, 2));
    }
    //--------------------------------------------------------------------------------8

    public static void main(String[] args) {

//        print(new double[]{4.2, 5.04, 5});

//        System.out.println(square(5f));
//        System.out.println(square(5,10));
//        System.out.println(square(5));

//        System.out.println(max(5,10,4,3));

//        System.out.println(distance(1,-1));

    }
}

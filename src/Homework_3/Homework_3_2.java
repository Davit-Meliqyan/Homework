package Homework_3;

import java.util.Scanner;

public class Homework_3_2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double d = scanner.nextDouble();
        float f = (float) d;
        System.out.println(f + " " + d);
        long l = (long) f;
        System.out.println(l + " " + f);
        int a = (int) l;
        System.out.println(a + " " + l);
        short s = (short) a;
        System.out.println(s + " " + a);
        byte b = (byte) s;
        System.out.println(b + " " + s+98);
    }
}

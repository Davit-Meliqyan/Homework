package Homework_3;

import java.util.Scanner;

public class Homework_3_1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        byte b = scanner.nextByte();
        short s = b;

        System.out.println(b + " " + s);
        int a = s;
        System.out.println(s + " " + a);
        long l = a;
        System.out.println(a + " " + l);
        float f = l;
        System.out.println(l + " " + f);
        double d = f;
        System.out.println(f + " " + d);
    }
}

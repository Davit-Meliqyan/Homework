package Homework_3;

import java.util.Scanner;

public class Homework_3 {


    public static void castingToBig(byte b) {

        System.out.println("insert byte type variable");
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

    public static void castingToSmall(float d){

        System.out.println("insert float type variable");
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

    public static void fahrenheitToCelsius(int tempFahrenheit){

        int tempCelsius = tempFahrenheit - 32;
        System.out.println("temperature Celsius" + tempCelsius);
        float result = tempCelsius;
        System.out.println("result in float" + result);
    }

    public static void findArea(double radius){

        System.out.println("input radius");
        double area = Math.PI * Math.pow(radius,2);
        System.out.println("area " + area);
    }


    public static void homework_3_5(){
        double d = 1/3;
        float f = 1/3;

        System.out.println("double " + d);
        System.out.println("float " + f);
    }

    private static void homework_3_6() {
        int year = 1996;
        char c1 = 'D', c2 = 'a', c3 = 'v', c4 ='i', c5 = 't';
        System.out.print( c1);
        System.out.print( c2);
        System.out.print( c3);
        System.out.print( c4);
        System.out.print( c5);
        System.out.print( " " + year);
    }

    private static void homework_3_7() {

        char c = 'A';
        int a = (int) c;
        System.out.println(a);
    }

    private static void homework_3_8() {

        double name = 'D' + 'a' + 'v' + 'i' + 't';
        System.out.println(name / 5);
    }

    private static void homework_3_9(int a) {

        char c = (char) a;
        System.out.println(a + "-" + c);
    }

    private static void concatTwoString(String st1, String st2) {

        System.out.println(st1 + st2);
    }

    private static void homework_3_11() {

        int a = 5;
        int b = 10;
        int s = a + b;
        System.out.println(a + "+" + b + "=" + s);
    }

    private static void homework_3_12() {
        String txt = "We are the so-called /Vikings/ from the north.";
    }

    private static void swapAToB(int a, int b) {

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println(a + " " + b);
    }

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        byte b = scanner.nextByte();
        Homework_3.castingToBig(b);

        float f = scanner.nextFloat();
        Homework_3.castingToSmall(f);

        int tempFahrenheit = scanner.nextInt();
        Homework_3.fahrenheitToCelsius(tempFahrenheit);

        double radius = scanner.nextDouble();
        Homework_3.findArea(radius);

        Homework_3.homework_3_5();

        Homework_3.homework_3_6();

        Homework_3.homework_3_7();

        Homework_3.homework_3_8();

        int a = scanner.nextInt();
        Homework_3.homework_3_9(a);

        String st1 = scanner.nextLine();
        String st2 = scanner.nextLine();
        Homework_3.concatTwoString(st1,st2);

        Homework_3.homework_3_11();

        Homework_3.homework_3_12();

        int x = scanner.nextInt();
        int y = scanner.nextInt();
        Homework_3.swapAToB(x,y);



    }




}

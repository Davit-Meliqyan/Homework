package Homeworke_1;

import java.util.Scanner;

public class Homework_1_16 {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("insert 3-digit number ");
        int a = scanner.nextInt();
        int secondDigit = 0;
        int digit = 0;
        int i = 0;

        while (i<3){
            digit = a%10;
            a /= 10;
            if(a > 0 && a < 10) secondDigit = digit;
            i++;
        };

        if (a == 0)System.out.println(secondDigit);
        else System.out.println("not 3-digit number ");

    }
}

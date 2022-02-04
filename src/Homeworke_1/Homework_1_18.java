package Homeworke_1;

import java.util.Scanner;

public class Homework_1_18 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("insert 3-digit number ");
        int a = scanner.nextInt();
        int digitSum = 0;
        int i = 0;
        int digit;

        while (i<3){
            digit = a%10;
            digitSum += digit;
            a /= 10;
            i++;
        };

        if (a == 0)System.out.println(digitSum);
        else System.out.println("not 3-digit number ");
    }
}

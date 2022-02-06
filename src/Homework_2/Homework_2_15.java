package Homework_2;

import java.util.Scanner;

public class Homework_2_15 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("insert number ");
        int a = scanner.nextInt();

        if(a % 2 == 0)System.out.println("number is even");
        if(a % 2 != 0)System.out.println("number is odd");
    }
}

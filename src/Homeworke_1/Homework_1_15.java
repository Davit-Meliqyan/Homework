package Homeworke_1;

import java.util.Scanner;

public class Homework_1_15 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("insert number ");
        int a = scanner.nextInt();

        if(a % 2 == 0)System.out.println("number is even");
        if(a % 2 != 0)System.out.println("number is odd");
    }
}

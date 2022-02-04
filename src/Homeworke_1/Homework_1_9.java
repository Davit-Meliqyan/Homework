package Homeworke_1;

import java.util.Scanner;

public class Homework_1_9 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("insert  number");
        int num = scanner.nextInt();
        System.out.println("last digit " + num % 10);
    }
}

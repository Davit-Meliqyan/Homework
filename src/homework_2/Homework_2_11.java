package homework_2;

import java.util.Scanner;

public class Homework_2_11 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("insert  a");
        int a = scanner.nextInt();

        System.out.println("insert  b");
        int b = scanner.nextInt();

        System.out.println("remainder from a to b " + a % b);
    }
}

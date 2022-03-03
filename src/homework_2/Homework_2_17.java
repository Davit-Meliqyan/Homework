package homework_2;

import java.util.Scanner;

public class Homework_2_17 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("insert 3-digit number ");
        int a = scanner.nextInt();
        int i = 0;
        int firstDigit = 0;

        while (i<3){
            firstDigit = a%10;
            a /= 10;
            i++;
        }

        if (a == 0)System.out.println(firstDigit);
        else System.out.println("not 3-digit number ");
    }
}

package homework_2;

import java.util.Scanner;

public class Homework_2_2 {

    public static void main(String[] args) {

        System.out.println("insert minutes");
        Scanner scanner = new Scanner(System.in);
        int minutes = scanner.nextInt();

        if(minutes < 0) System.err.println("ERROR");
        else {
            if(minutes % 60 == 0) System.out.println(minutes/60  + " hours");
            else System.out.println(minutes/60  + " hours " + minutes % 60 + " minutes ");
       }

    }
}

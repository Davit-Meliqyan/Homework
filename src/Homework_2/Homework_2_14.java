package Homework_2;

import java.util.Random;

public class Homework_2_14 {

    public static void main(String[] args) {

        int max = 100;
        int min = 1;

        Random randomNum = new Random();
        int randomNumber = min + randomNum.nextInt(max);
        System.out.print(randomNumber + " ");
    }
}

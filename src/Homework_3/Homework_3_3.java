package Homework_3;

import java.util.Scanner;

public class Homework_3_3 {

    public static void main(String[] args) {

        System.out.println("insert temperature Fahrenheit");
        Scanner scanner = new Scanner(System.in);
        int tempFahrenheit = scanner.nextInt();


        int tempCelsius = tempFahrenheit - 32;
        System.out.println("temperature Celsius" + tempCelsius);
        float result = tempCelsius;
        System.out.println("result in float" + result);

    }
}

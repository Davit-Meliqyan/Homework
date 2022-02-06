package Homework_2;

public class Homework_2_8 {

    public static void main(String[] args) {

        int sum = 0;
        for (int n=1; n <= 10; n++){
             sum += Homework_2_8.S(n);}

        System.out.println(sum);

        for (int n=1; n <= 15; n++){
            sum += Homework_2_8.S(n);}

        System.out.println(sum);

    }

    static int S(int n){ return 3*n*n-12*n;}
}

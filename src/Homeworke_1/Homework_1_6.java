package Homeworke_1;

public class Homework_1_6 {

    public static void main(String[] args) {

        System.out.println(Homework_1_6.areaRightAngledTriangle(4,5));
        System.out.println(Homework_1_6.areaSquare(6));
        System.out.println(Homework_1_6.areaRectangle(7,8));

    }

    static double areaRightAngledTriangle(double a,double b){ return a*b/2;}
    static double areaSquare(double a){ return a*a;}
    static double areaRectangle(double a,double b){ return a*b;}
}

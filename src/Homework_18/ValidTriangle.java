package Homework_18;

public final class ValidTriangle {

    private ValidTriangle() {
    }

    public static boolean validSide(double side) {
        return side >= 1 && side <= 20;
    }

    public static boolean validIsTriangle(double sideA, double sideB, double sideC) {
//        return sideA * sideB * sideC != 0 && Math.max(Math.max(sideA, sideB), sideC) < sideA + sideB + sideC - Math.max(Math.max(sideA, sideB), sideC);
        return sideA * sideB * sideC != 0 && sideA + sideB > sideC && sideA + sideC > sideB && sideB + sideC > sideA;
    }
}

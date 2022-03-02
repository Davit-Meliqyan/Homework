package Homework_18;

public class Triangle {
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle() {
    }

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }


    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }

    private boolean validIsTriangle(double sideA, double sideB, double sideC) {
//        return sideA * sideB * sideC != 0 && Math.max(Math.max(sideA, sideB), sideC) < sideA + sideB + sideC - Math.max(Math.max(sideA, sideB), sideC);
        return sideA * sideB * sideC != 0 && sideA + sideB > sideC && sideA + sideC > sideB && sideB + sideC > sideA;
    }

    public  boolean check() {
        return validIsTriangle(getSideA(), getSideB(), getSideC());
    }

    public boolean checkRight() {
        return getSideA() == getSideB() && getSideB() == getSideC();
    }

    public double areaOrPerimeter(){
        double p = (getSideA()+getSideB()+getSideC())/2;
        if(checkRight()){
            return Math.sqrt(p*(p-getSideA())*(p-getSideB())*(p-getSideC()));
        }
        return 2*p;
    }

}

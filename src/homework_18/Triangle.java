package homework_18;

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

    public boolean check() {
        return validIsTriangle(getSideA(), getSideB(), getSideC());
    }

    public boolean checkRight() {
        return getSideA() == getSideB() && getSideB() == getSideC();
    }

    private double area() {
        double p = (getSideA() + getSideB() + getSideC()) / 2;
        return Math.sqrt(p * (p - getSideA()) * (p - getSideB()) * (p - getSideC()));
    }

    private double perimeter() {
        return (getSideA() + getSideB() + getSideC());
    }

    public boolean isSquare(){
        return Math.pow(Math.max(Math.max(sideA,sideB),sideC),2) == Math.pow(Math.min(Math.min(sideA,sideB),sideC),2) +Math.pow(sideA+sideB+sideC-Math.min(Math.min(sideA,sideB),sideC)- Math.max(Math.max(sideA,sideB),sideC),2);
    }
    public double areaOrPerimeter() {
        if (checkRight()) {
            return area();
        }
        return perimeter();
    }
}

package Homework_18;

public final class Validator {

    private Validator() {
    }

    public static boolean validFirstName(String firstName) {
        return firstName.length() >= 3 && firstName.length() <= 15;
    }

    public static boolean validLastName(String lastName) {
        return lastName.length() >= 6 && lastName.length() <= 20;
    }

    public static boolean validAge(int age) {
        return age > 0 && age < 99;
    }

    public static boolean validPassportId(String passportId) {
        boolean flag = true;
        for (int i = 2; i < passportId.length(); i++) {
            if ("0123456789".indexOf(passportId.charAt(i)) == -1) {
                flag = false;
                break;
            }
        }
        return passportId.length() == 8 && passportId.charAt(0) == 'A' && passportId.charAt(1) == 'N' && flag;
    }

    public static boolean validSide(double side) {
        return side >= 1 && side <= 20;
    }

    public static boolean validIsTriangle(double sideA, double sideB, double sideC) {
//        return sideA * sideB * sideC != 0 && Math.max(Math.max(sideA, sideB), sideC) < sideA + sideB + sideC - Math.max(Math.max(sideA, sideB), sideC);
        return sideA * sideB * sideC != 0 && sideA + sideB > sideC && sideA + sideC > sideB && sideB + sideC > sideA;
    }
}

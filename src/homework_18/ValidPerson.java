package homework_18;

public final class ValidPerson {

    private ValidPerson() {
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
        if (passportId == null){
            return false;
        }
        else {
            for (int i = 2; i < passportId.length(); i++) {
                if ("0123456789".indexOf(passportId.charAt(i)) == -1) {
                   return false;
                }
            }
            return passportId.length() == 8 && passportId.substring(0,2).equals("AN");}

    }



}

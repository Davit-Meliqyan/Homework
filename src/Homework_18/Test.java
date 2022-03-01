package Homework_18;


import Homework_5.Gender;


public class Test {
    public static void main(String[] args) {
        Person person = new Person("Armen", "Meliqyan", "AN123456", 20, Gender.MALE, "ARM");

        Person person1 = new Person();


        if (Validator.validFirstName("Armen")) {
            person1.setFirstName("Armen");
        }
        if (Validator.validLastName("Meliqyan")) {
            person1.setLastName("Meliqyan");
        }
        if (Validator.validAge(20)) {
            person1.setAge(20);
        }
        if (Validator.validPassportId("AN124585")) {
            person1.setPassportId("AN124585");
        }
        person1.setGender(Gender.MALE);

//        person1.display();

        Triangle triangle = new Triangle(30,30,30);

        System.out.println(triangle.check());
        System.out.println(triangle.checkRight());
        System.out.println(triangle.areaOrPerimeter());
    }
}

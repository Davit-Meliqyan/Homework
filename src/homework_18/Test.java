package homework_18;


import static homework_5.Gender.*;


public class Test {
    public static void main(String[] args) {
        Person person = new Person("Armen", "Meliqyan", "AN123456", 20, MALE, "ARM");

        Person person1 = new Person();


        if (ValidPerson.validFirstName("Arm")) {
            person1.setFirstName("Arm");
        }
        if (ValidPerson.validLastName("Meliqyan")) {
            person1.setLastName("Meliqyan");
        }
        if (ValidPerson.validAge(20)) {
            person1.setAge(20);
        }
        if (ValidPerson.validPassportId("AN124120")) {
            person1.setPassportId("AN124120");
        }
        person1.setGender(MALE);

//        person1.display();
        Triangle triangle = new Triangle(5,12,13);
//        Triangle triangle = new Triangle(30,30,30);
//
//        System.out.println(triangle.check());
//        System.out.println(triangle.checkRight());
//        System.out.println(triangle.areaOrPerimeter());


        System.out.println(triangle.isSquare());
    }
}

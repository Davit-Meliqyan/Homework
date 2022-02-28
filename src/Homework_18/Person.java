package Homework_18;

public class Person {
    private String firstName;
    private String lastName;
    private String passportId;
    private int age;
    private Gender gender;
    private String nationality;

    public Person(String firstName, String lastName, String passportId, int age, Gender gender, String nationality) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.passportId = passportId;
        this.age = age;
        this.gender = gender;
        this.nationality = nationality;
    }

    public Person() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassportId() {
        return passportId;
    }

    public void setPassportId(String passportId) {
        this.passportId = passportId;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public void display(){
        System.out.println("FirstName is " + this.firstName);
        System.out.println("LastName is " + this.lastName);
        System.out.println("PassportId is " + this.passportId);
        System.out.println("Age is " + this.age);
        System.out.println("Gender is " + this.gender);
    }
}

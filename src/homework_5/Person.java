package homework_5;

public class Person {

    String name;
    int age;
    String address;
    String email;
    String salary;

    public Person() {
    }


    public Person(String name, String address, String email) {
        this.name = name;
        this.address = address;
        this.email = email;
    }

    public Person(String name, int age, String address, String email, String salary) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.email = email;
        this.salary = salary;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(int age, String name) {
        this.name = name;
        this.age = age;
    }

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void showInfo() {
        System.out.println(getName()+" "+getAge()+" "+getAddress() +" "+ getSalary()+ " "+ getEmail());
    }
}

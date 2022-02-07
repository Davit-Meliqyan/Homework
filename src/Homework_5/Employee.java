package Homework_5;

public class Employee {

    long id;
    String name;
    int age;
    String department;
    Gender gender;

    public Employee(long id, String name, int age, String department, Gender gender) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.department = department;
        this.gender = gender;
    }

    public Employee() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public  void employeeInfo() {
        System.out.println(getId()+" "+getName()+" "+getAge()+" "+getDepartment()+" "+getGender());
    }
}

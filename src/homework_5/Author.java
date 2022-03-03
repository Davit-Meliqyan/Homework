package homework_5;

public class Author {

    String name;
    String email;
    Homework_5.Gender gender;

    public Author(String name, String email, Homework_5.Gender gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Homework_5.Gender getGender() {
        return gender;
    }

    public void setGender(Homework_5.Gender gender) {
        this.gender = gender;
    }

    public  void showInfo() {
        System.out.println(getName()+" "+getEmail()+" "+getGender());
    }
}

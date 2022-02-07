package Homework_5;

public class Test {

    public static void main(String[] args) {

        Person person1 = new Person("Vazgen", 15, "Abovyan");
        Person person2 = new Person("Manuk", 28, "Hrazdan");
        person1.personInfo();
        person2.personInfo();


        Employee employee1 = new Employee(1258, "Mane", 30
                , "IT", Gender.MALE);
        Employee employee2 = new Employee(1285, "Karine", 34
                , "Culture", Gender.FEMALE);
        Employee employee3 = new Employee(1275, "Armen", 21
                , "IT", Gender.MALE);
        Employee employee4 = new Employee(1299, "Armen", 29
                , "IT", Gender.MALE);
        Employee employee5 = new Employee(1265, "Gor", 42
                , "Security", Gender.MALE);


        employee1.employeeInfo();
        employee2.employeeInfo();
        employee3.employeeInfo();
        employee4.employeeInfo();
        employee5.employeeInfo();


        Author PauloCoelho = new Author("Paulo Coelho", "pauloco@gmail.com", Gender.MALE);
        Author LevTolstoy = new Author("Lev Tolstoy", "lev1847@gmail.com", Gender.MALE);
        PauloCoelho.authorInfo();
        LevTolstoy.authorInfo();

        Book alchemist = new Book("alchemist", PauloCoelho, 2500);
        Book annaKarenina = new Book("Anna Karenina", LevTolstoy, 3500);
        Book adultery = new Book("adultery", PauloCoelho, 3000);
        adultery.bookInfo();
        annaKarenina.bookInfo();
        alchemist.bookInfo();

    }

}

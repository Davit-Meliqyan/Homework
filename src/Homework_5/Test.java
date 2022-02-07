package Homework_5;

public class Test {

    public static void main(String[] args) {

        Person person1 = new Person("Vazgen", 15, "Abovyan");
        Person person2 = new Person("Manuk", 28, "Hrazdan");
        Person.personInfo(person1);
        Person.personInfo(person2);


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


        Employee.employeeInfo(employee1);
        Employee.employeeInfo(employee2);
        Employee.employeeInfo(employee3);
        Employee.employeeInfo(employee4);
        Employee.employeeInfo(employee5);


        Author PauloCoelho = new Author("Paulo Coelho", "pauloco@gmail.com", Gender.MALE);
        Author LevTolstoy = new Author("Lev Tolstoy", "lev1847@gmail.com", Gender.MALE);
        Author.authorInfo(PauloCoelho);
        Author.authorInfo(LevTolstoy);

        Book alchemist = new Book("alchemist", PauloCoelho, 2500);
        Book annaKarenina = new Book("Anna Karenina", LevTolstoy, 3500);
        Book adultery = new Book("adultery", PauloCoelho, 3000);
        Book.bookInfo(alchemist);
        Book.bookInfo(annaKarenina);
        Book.bookInfo(adultery);

    }

}

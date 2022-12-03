import Service.PersonService;
import Service.PersonServiceImpl;

public class Main {
    public static void main(String[] args) {
        PersonService person = new PersonServiceImpl();
        person.personAdd();
        System.out.println("---------------------------------------");
        person.printPersonInfo();
    }
}
package Service;

import ObjectClases.Enum.Gender;
import ObjectClases.Person;
import Repository.PersonRepository;

import java.util.Scanner;

public class PersonServiceImpl implements PersonService{
    private Person person;
    private PersonRepository rep;

    public Person getPerson() {
        return person;
    }

    public PersonRepository getRep() {
        return rep;
    }

    @Override
    public void personAdd() {
        System.out.println("Введите данные согласно формату (Фамилия Имя Отчество Дата рождения Номер телефона Пол) " +
                "через пробел ");
        Scanner sc = new Scanner(System.in);
        String goToParse  = sc.nextLine();
        Parser prs = new Parser();
        String [] arr = prs.parse(goToParse);


    }

    @Override
    public void printPersonInfo() {
        System.out.printf("Вы ввели:\n Фамилия: %s\n Имя: %s\n Отчество: %s \n Дата рождения: %s \n Номер телефона: %s \n " +
                "Пол: %s", person.getSurname(), person.getName(), person.getMiddleName(), person.getDateOfBirth(), person.getNumberOfPhone(), person.getGender());

    }

}

package Service;

import ObjectClases.Enum.Gender;
import ObjectClases.Person;
import Repository.PersonRepository;

import java.util.Scanner;

public class PersonServiceImpl implements PersonService{
    private Person personSer;
    private PersonRepository repSer;

    public Person getPerson() {
        return this.personSer;
    }

    public PersonRepository getRep() {
        return this.repSer;
    }


    @Override
    public void personAdd() {
        System.out.println("Введите данные согласно формату (Фамилия Имя Отчество Дата рождения Номер телефона Пол) " +
                "через пробел ");
        Scanner sc = new Scanner(System.in);
            String goToParse = sc.nextLine();
            Parser prs = new Parser();
            String[] arr = prs.parse(goToParse);

                if (arr.length != 6) {
                    throw new RuntimeException("Введите все данные через 1 пробел ");
                }

        this.personSer = new Person(arr[0], arr[1], arr[2],arr[3], Long.parseLong(arr[4]), arr[5].charAt(0));


    }

    @Override
    public void printPersonInfo() {
        System.out.printf("Вы ввели:\n Фамилия: %s\n Имя: %s\n Отчество: %s \n Дата рождения: %s \n Номер телефона: %s \n " +
                "Пол: %s", personSer.getSurname(), personSer.getName(), personSer.getMiddleName(), personSer.getDateOfBirth(),
                personSer.getNumberOfPhone(), personSer.getGender());

    }

}

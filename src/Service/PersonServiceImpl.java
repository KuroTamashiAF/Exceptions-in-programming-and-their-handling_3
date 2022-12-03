package Service;

import ObjectClases.Enum.Gender;
import ObjectClases.Person;

import java.util.Scanner;

public class PersonServiceImpl implements PersonService{
    Person person;

    @Override
    public void personAdd(String date) {
        System.out.println("Введите данные согласно формату (Имя Фамилия Отчество Дата рождения Номер телефона Пол) " +
                "через пробел ");
        Scanner sc = new Scanner(System.in);
        String goToParse  = sc.nextLine();
        Parser prs = new Parser();
        String [] arr = prs.parse(goToParse);
        new Person(arr[0], arr[1], arr[2], arr[3], Integer.parseInt(arr[4]),arr[5]);


    }
}

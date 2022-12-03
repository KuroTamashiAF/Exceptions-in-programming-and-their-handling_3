package Service;

import ObjectClases.Person;

public class PersonServiceImpl implements PersonService{
    Person person;

    @Override
    public void personAdd(String date) {
        System.out.println("Введите данные согласно формату (Имя Фамилия Отчество Дата рождения Номер телефона Пол) " +
                "через пробел ");

    }
}

package Repository;

import ObjectClases.Person;

import java.util.ArrayList;
import java.util.List;

public class PersonRepository {
    private List <Person> arrPerson;

    public PersonRepository() {
        this.arrPerson = new ArrayList<>();
    }
    public void addPersonInBase(Person person)
    {
        this.arrPerson.add(person);
    }

    public List<Person> getArrPerson() {
        return this.arrPerson;
    }
}

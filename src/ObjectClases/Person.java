package ObjectClases;

import ObjectClases.Enum.Gender;

public class Person {
    private String surname;
    private String name;
    private String middleName;
    private String dateOfBirth;  // dd.mm.yyyy
    private long numberOfPhone;
    private char gender;

    public Person(String surname, String name, String middleName, String dateOfBirth, long numberOfPhone, char gender) {
        this.surname = surname;
        this.name = name;
        this.middleName = middleName;
        this.dateOfBirth = dateOfBirth;
        this.numberOfPhone = numberOfPhone;
        this.gender = gender;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public long getNumberOfPhone() {
        return numberOfPhone;
    }

    public char getGender() {
        return gender;
    }
}

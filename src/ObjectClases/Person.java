package ObjectClases;

import ObjectClases.Enum.Gender;

public class Person {
    private String surname;
    private String name;
    private String middleName;
    private String dateOfBirth;  // dd.mm.yyyy
    private int numberOfPhone;
    private Gender gender;

    public Person(String surname, String name, String middleName, String dateOfBirth, int numberOfPhone, Gender gender) {
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

    public int getNumberOfPhone() {
        return numberOfPhone;
    }

    public Gender getGender() {
        return gender;
    }
}

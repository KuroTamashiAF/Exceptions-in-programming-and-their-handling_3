package Service.Errors;

public class IncorrectDateOfBirth extends Exception{
    private String inp;

    public IncorrectDateOfBirth(String inp) {
        this.inp = inp;
    }

    public String getInp() {
        return "Не корректный ввод даты рождения " + inp +  " дата должна состоять из цифр разделенная точкой " +
                "по формату dd.mm.yyyy";
    }
}

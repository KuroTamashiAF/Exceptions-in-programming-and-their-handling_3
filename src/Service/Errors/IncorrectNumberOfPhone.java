package Service.Errors;

public class IncorrectNumberOfPhone extends Exception{
    private String inp;

    public IncorrectNumberOfPhone(String inp) {
        this.inp = inp;
    }

    public String getInp() {
        return " Не правильно набран номер " + inp + " Номер должен состоять из 11 цифр включая 8 для России";
    }
}

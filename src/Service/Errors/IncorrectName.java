package Service.Errors;

public class IncorrectName extends Exception{
    private String inp;

    public IncorrectName(String inp) {
        this.inp = inp;
    }

    public String getInp() {
        return "Вы ввели не коректное имя  " + inp + " Имя может сотоять из букв\n";
    }
}

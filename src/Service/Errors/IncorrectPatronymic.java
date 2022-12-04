package Service.Errors;

public class IncorrectPatronymic extends Exception{
    private String inp;

    public IncorrectPatronymic(String inp) {
        this.inp = inp;
    }

    public String getInp() {
        return "Не корректный ввод Отчества  " + inp + " Отчество должно состоять из букв \n";
    }
}

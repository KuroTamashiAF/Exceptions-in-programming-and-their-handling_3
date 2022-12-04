package Service.Errors;

public class IncorrectGender extends Exception{
    private char inp;

    public IncorrectGender(char inp) {
        this.inp = inp;
    }

    public String getInp() {
        return "Некооректный ввод пола " + inp + " Введиде латинскую букву f - Женский или  m - Мужской ";
    }
}

package Service.Errors;

public class IncorrectLastName extends  Exception{
    private String inputStr;

    public IncorrectLastName(String inp) {
        this.inputStr = inp;
    }

    public String getInputStr() {
        return "Неправильный формат ввода " + this.inputStr + " Фамилия может сотоять из букв\n";
    }
}

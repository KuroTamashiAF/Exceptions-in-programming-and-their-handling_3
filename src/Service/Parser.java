package Service;

import Service.Errors.*;

public class Parser {
public String[] parse(String data) throws IncorrectLastName, IncorrectName, IncorrectPatronymic,
        IncorrectDateOfBirth, IncorrectNumberOfPhone {
    String []arr  = data.split(" ");

    if ( arr[0].equals("") || arr[0].equals(" ")){
        throw new IncorrectLastName(arr[0]);
    }
    if (arr[1].equals("") || arr[1].equals(" ")){
        throw new IncorrectName(arr[1]);
    }
    if (arr[2].equals("") || arr[2].equals(" ")) {
        throw new IncorrectPatronymic(arr[2]);
    }
    if (arr[3].equals("") || arr[3].equals(" ")) {
        throw new IncorrectDateOfBirth(arr[3]);
    }
    if (arr[4].length() != 11){
        throw new IncorrectNumberOfPhone(arr[4]);
    }




    return arr;
    }
}

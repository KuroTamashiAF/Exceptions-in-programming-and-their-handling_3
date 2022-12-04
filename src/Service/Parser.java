package Service;

import Service.Errors.IncorrectDateOfBirth;
import Service.Errors.IncorrectLastName;
import Service.Errors.IncorrectName;
import Service.Errors.IncorrectPatronymic;

public class Parser {
public String[] parse(String data) throws IncorrectLastName, IncorrectName, IncorrectPatronymic, IncorrectDateOfBirth {
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




    return arr;
    }
}

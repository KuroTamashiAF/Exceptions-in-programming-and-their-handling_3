package Service;

import Service.Errors.IncorrectLastName;
import Service.Errors.IncorrectName;

public class Parser {
public String[] parse(String data) throws IncorrectLastName, IncorrectName {
    String []arr  = data.split(" ");

    if ( arr[0].equals("") || arr[0].equals(" ")){
        throw new IncorrectLastName(arr[0]);
    }
    if (arr[1].equals("") || arr[1].equals(" ")){
        throw new IncorrectName(arr[1]);
    }



    return arr;
    }
}

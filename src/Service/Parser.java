package Service;

import Service.Errors.IncorrectLastName;

public class Parser {
public String[] parse(String data) throws IncorrectLastName {
    String []arr  = data.split(" ");

    if ( arr[0].equals("") || arr[0].equals(" ")){
        throw new IncorrectLastName(arr[0]);
    }



    return arr;
    }
}

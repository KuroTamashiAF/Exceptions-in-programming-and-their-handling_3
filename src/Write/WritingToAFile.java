package Write;

import ObjectClases.Person;
import Service.PersonServiceImpl;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WritingToAFile {
    public void write(Person per){
        File file = new File(per.getSurname());
            try (FileWriter fw = new FileWriter(file, true)){
                fw.write(per.toString() + "\n");
            } catch (IOException e) {
            }

    }
}

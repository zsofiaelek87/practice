package Page19Ex02Exceptions_d;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {

    List<String> stringList = new ArrayList<>();

    public List<String> readFile(String path) {
        try (FileReader fileReader = new FileReader(path);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            while (true) {
                String line = null;

                line = bufferedReader.readLine();

                stringList.add(line);
                if (line == null) {
                    break;
                }
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return stringList;


    }

}

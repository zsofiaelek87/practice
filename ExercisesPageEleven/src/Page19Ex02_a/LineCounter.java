package Page19Ex02_a;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LineCounter {

    public Integer countLines(String path) {

        Integer counter = 0;
        try (FileReader fileReader = new FileReader(path);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                } else {
                    counter++;
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return counter;
    }
}

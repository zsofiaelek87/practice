package task0302;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.List;
import java.util.Set;

public class OutputWriter {
    public void printToConsole(Set<String> fruits){
        fruits.stream()
                .forEach(fruit -> System.out.println(fruit));
    }

}

package task01_Numbers_InputOutput;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.List;

public class OutputWriter {
    public void printToConsole(List<Integer> numbers){
        numbers.stream()
                .forEach(number -> System.out.println(number));
    }

    public void printToFile(List<Integer> numbers){
        try(FileWriter fileWriter = new FileWriter("numbers.txt");
            PrintWriter printWriter = new PrintWriter(fileWriter)){
            numbers.stream()
                    .forEach(number -> printWriter.println(number));
        }
        catch (Exception e){

        }
    }
}

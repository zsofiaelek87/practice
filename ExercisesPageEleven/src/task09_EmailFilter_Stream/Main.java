package task09_EmailFilter_Stream;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        String text = "Lorem ipsum dolor sit@amet.com, consectetur adipiscing@elit.com Praesent nec suscipit sapien";

        String[] splitedText = text.split("\\s+");

        List<String> words = Arrays.asList(splitedText);

        words.stream()
                .filter(word -> word.contains("@"))
                .forEach(System.out::println);

        words.stream()
                .filter(word -> word.contains("@"))
                .map (string -> string.replace("@","#"))
                .forEach(System.out::println);


        String[] splittedText2 = text.split("[0-9a-zA-Z]*@[0-9a-zA-Z]*\\.[a-zA-Z]*");
        String results = Arrays.stream(splittedText2)
                .collect(Collectors.joining("#"));
    }
}

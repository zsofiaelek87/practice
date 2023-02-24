package task03_Fruit_Factory;

import java.util.*;

public class UserInputReader {
    private static final String STOP = "STOP";

    public List<String> readInput() {
        List<String> fruits = new ArrayList<>();

        try (Scanner scanner = new Scanner(System.in)) {
            Integer counter = 0;

            while (counter<4) {
                String input = scanner.next();

                    String inputFruit = input;
                    fruits.add(inputFruit);
                    counter++;

            }
        }
        return fruits;
    }
}

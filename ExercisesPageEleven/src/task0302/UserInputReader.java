package task0302;

import java.util.*;

public class UserInputReader {
    private static final String STOP = "STOP";

    public Set<String> readInput() {
        Set<String> fruits = new HashSet<>();

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

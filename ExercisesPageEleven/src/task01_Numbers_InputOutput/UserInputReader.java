package task01_Numbers_InputOutput;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserInputReader {
    private static final String STOP = "STOP";

    public List<Integer> readNumbers() {
        List<Integer> numbers = new ArrayList<>();

        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                String input = scanner.next();
                if (STOP.equals(input)) {
                    break;
                } else {
                    Integer inputNumber = Integer.parseInt(input);
                    numbers.add(inputNumber);
                }
            }
        }
        return numbers;
    }
}

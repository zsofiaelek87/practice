package Page19Ex02Exceptions_c;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumberReader {


    private List<Integer> numberList= new ArrayList<>();


    public int readNumber(Scanner scanner) {
        while (true) {
            if (scanner.hasNextInt()) {
                numberList.add(scanner.nextInt());
            } else {
                scanner.next();
                System.out.println("Give me a NUMBER");
                throw new NumberFormatException();
            }
        }

    }

    public MinMax minMax(){
        Integer max = numberList.stream()
                .mapToInt(n->n)
                .max()
                .orElse(Integer.MIN_VALUE);

        Integer min = numberList.stream()
                .mapToInt(n->n)
                .min()
                .orElse(Integer.MIN_VALUE);

        return new MinMax(min, max);
    }
}

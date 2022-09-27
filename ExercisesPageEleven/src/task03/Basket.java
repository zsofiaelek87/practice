package task03;

import java.util.*;

public class Basket {
    public Set<Integer> readFruits() {
        Set<Integer> fruits = new HashSet<>();

        try (Scanner scanner = new Scanner(System.in)) {
            while (fruits.size() < 15) {
                String fruit = scanner.next();
                Integer inputFruit = Integer.parseInt(fruit);
                fruits.add(inputFruit);
            }
        }
        fruits.stream()
                .forEach(fruit -> System.out.println(fruit));
        return fruits;
    }

    ;
}



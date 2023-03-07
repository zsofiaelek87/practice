package Page19Ex04StreamApi_e;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> numberList = new ArrayList<>();
        numberList.add(10);
        numberList.add(2);
        numberList.add(20);
        numberList.add(7);
        numberList.add(35);

        PrimeNumberFinder primeNumberFinder = new PrimeNumberFinder();
        primeNumberFinder.findPrime(numberList).forEach(System.out::println);

    }
}

package task01_Numbers_InputOutput;

import java.util.List;
import java.util.stream.Collectors;

public class NumberFilter {
    public List<Integer> getEvenNumbers(List<Integer> numbers) {
        List<Integer> filteredNumbers = numbers.stream()
                .filter(number -> number % 2 == 0)
                .collect(Collectors.toList());
        return filteredNumbers;

    }

    public List<Integer> getPrimeNumber(List<Integer> numbers){

        List<Integer> filteredNumbers = numbers.stream()
                .filter(number -> isPrime(number))
                .collect(Collectors.toList());
        return filteredNumbers;
    }

    private boolean isPrime(int number){
        int counter = 0;
        for(int i = 2; i<number; i++){
            if(number % i ==0 ){
                counter++;
            }
        }
        return counter ==0;
    }
}

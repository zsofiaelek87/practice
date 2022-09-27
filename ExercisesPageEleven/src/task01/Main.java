package task01;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        UserInputReader userInputReader = new UserInputReader();
        NumberFilter numberFilter = new NumberFilter();
        OutputWriter outputWriter = new OutputWriter();

        List<Integer> userInputNumbers = userInputReader.readNumbers();
        List<Integer> evenNumbers = numberFilter.getEvenNumbers(userInputNumbers);
        List<Integer> primeNumbers = numberFilter.getPrimeNumber(userInputNumbers);

        outputWriter.printToConsole(evenNumbers);
        outputWriter.printToFile(primeNumbers);
    }
}

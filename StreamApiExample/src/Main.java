
/*Adott az alábbi tömb: [-12,2,6,78,41,25,-126,-8,-7,-52,458,5] Stream API használatával adjuk meg az alábbiakat:
az elemek összegét,
az elemek számát,
a legkisebb elemet,
a legnagyobb elemet, HF
növekvő sorrendben legyenek kiírva az elemek,
a páros elemek számát,
a páratlan elemek számát, HF
a negatív elemek számát. HF
Gyűjtsd ki a pozitív számokat egy Listbe.
Gyűjtsd ki a páros számokat egy Setbe. HF
*/
// terminated operators: foreach, count, results(min, max, sum, avg), collect, find.., ..match


import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {-12, 2, 6, 78, 41, 25, -126, -8, -7, -52, 458, 5};
        //az elemek kiírása
        Arrays.stream(numbers)
                .forEach(number -> System.out.println(number));

        //az elemek összegét,
        int sum = Arrays.stream(numbers)
                .sum();
        System.out.println("Elemek összege: " + sum);

        //az elemek számát,
        long count = Arrays.stream(numbers)
                .count();
        System.out.println("Elemek száma: " + count);

        //a legkisebb elemet,
        OptionalInt minOptional = Arrays.stream(numbers)
                .min();
        if (minOptional.isPresent()) {
            System.out.println("Minimum: " + minOptional.getAsInt());
        }

        //növekvő sorrendben legyenek kiírva az elemek,
        Arrays.stream(numbers)
                .sorted()
                .forEach(number -> System.out.println(number));

        //a páros elemek számát,
        long countEven = Arrays.stream(numbers)
                .filter(number -> number % 2 == 0)
                .count();
        System.out.println("Páros elemek száma: " + countEven);

        //Gyűjtsd ki a pozitív számokat egy Listbe.

        /*List<Integer> collectedNumbers = Arrays.stream(numbers)
                .filter(number -> number > 0)
                .map(n -> n)
                .collect(Collectors.toList());

        List<Integer> proba = Arrays.asList(numbers).stream()
                .collect(Collectors.toList());

         */
        Names names = new Names(); // non static method
        names.names();

        //Names.names(); // static method
    }

}
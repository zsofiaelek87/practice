package Page19Ex02Exceptions_c;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){
            NumberReader numberReader = new NumberReader();
            numberReader.readNumber(scanner);
            System.out.println(numberReader.minMax());

        }
    }
}

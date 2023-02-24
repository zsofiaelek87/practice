package task17_BlaBlaKutya_Exceptions;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {

    public static int getNumber(Scanner scanner){
        while(true){
            if(scanner.hasNextInt()){
                return scanner.nextInt();
            } else {
                scanner.nextLine();
                System.out.println("Give me a NUMBER");
            }
        }
    }

    public static void main(String[] args) {

        /*
        try(Scanner scanner = new Scanner(System.in)) {

            System.out.println("Give me the starting character number");
            int input1 = scanner.nextInt();
            System.out.println("Give me the ending character number");
            int input2 = scanner.nextInt();
            System.out.println("Give me the text");
            String input3 = scanner.next();


            UserInput userInput = new UserInput(input1, input2, input3);
            FilterString filterString = new FilterString(userInput);
            System.out.println("This is the filtered text based on the start and end character");
            System.out.println(filterString.filter());
        } catch( IncorrectIndexException ex){
            System.out.println(ex);
        }
*/
       boolean valid;
       valid = true;
        do {

        try(Scanner scanner = new Scanner(System.in)){

            System.out.println("Give me the starting character number");

            int input1 = getNumber(scanner);

            System.out.println("Give me the ending character number");

            int input2 = getNumber(scanner);

            System.out.println("Give me the text");
            String input3 = scanner.next();

            UserInput userInput = new UserInput(input1, input2, input3);
            FilterString filterString = new FilterString(userInput);
            System.out.println("This is the filtered text based on the start and end character");
            System.out.println(filterString.filter());
        }
        catch (Exception ex){
            System.out.println("ERROR: Give me a NUMBER");
            valid = false;
        }

    } while (!valid);
    }

}

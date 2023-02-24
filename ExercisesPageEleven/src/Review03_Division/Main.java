package Review03_Division;

public class Main {
    public static void main(String[] args) {
        Integer number1 = 3;
        Integer number2 = null;

        try{
            System.out.println(number1/number2);

        }
        catch(ArithmeticException a){
            System.out.println("BlaBla Kutya");
        }



    }
}

package Page19Ex02_b;

public class Main {
    public static void main(String[] args) {
        NumberDivider numberDivider = new NumberDivider();

        Double number1 = 0.1;
        Double number2 = 0.1;


        try{
            Double result = numberDivider.divideNumbers(number1, number2);
            System.out.println(result);
        } catch(Exception e){
            System.out.println(e);
        }


    }
}

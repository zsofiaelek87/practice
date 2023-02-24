package Page19Ex02_b;

public class NumberDivider {

    public Double divideNumbers(Double number1, Double number2) {
        Double result = null;
        if (number2 != 0) {
            result = number1 / number2;
            return result;
        } else {
            throw new ArithmeticException();
        }
    }
}

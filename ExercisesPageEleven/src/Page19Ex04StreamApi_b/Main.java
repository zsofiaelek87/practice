package Page19Ex04StreamApi_b;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> stringList = new ArrayList<>();
        stringList.add("jdkabvkjv");
        stringList.add("jdk");
        stringList.add("jdkab");
        stringList.add("jdkabv");
        stringList.add("j");

        CalculatorForWordLength calculatorForWordLength = new CalculatorForWordLength();
        Double result = calculatorForWordLength.calculator(stringList);
        System.out.println(result);
    }
}

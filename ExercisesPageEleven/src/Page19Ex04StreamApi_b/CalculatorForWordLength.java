package Page19Ex04StreamApi_b;

import java.util.List;
import java.util.OptionalDouble;

public class CalculatorForWordLength {

    public Double calculator(List<String> stringList){
      OptionalDouble average = stringList.stream()
                .mapToInt(s -> s.length())
                .average();
        return average.orElse(0);
    }


}

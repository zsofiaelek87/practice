package Page19Ex04_b;

import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class CalculatorForWordLength {

    public Double calculator(List<String> stringList){
      OptionalDouble average = stringList.stream()
                .mapToInt(s -> s.length())
                .average();
        return average.orElse(0);
    }


}

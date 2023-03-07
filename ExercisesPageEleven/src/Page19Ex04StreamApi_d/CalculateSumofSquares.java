package Page19Ex04StreamApi_d;

import java.util.List;

public class CalculateSumofSquares {
    public Integer calculator(List<Integer> numberList){


        Integer result = numberList.stream()
                .mapToInt(i -> i*i)
                .sum();

        return result;
    }
}

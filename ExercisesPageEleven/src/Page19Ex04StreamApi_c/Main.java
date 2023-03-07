package Page19Ex04StreamApi_c;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numberList = new ArrayList<>();
        numberList.add(1);
        numberList.add(1);
        numberList.add(2);
        numberList.add(2);
        numberList.add(3);
        numberList.add(1);
        numberList.add(1);

        FindMostCommonElement findMostCommonElement = new FindMostCommonElement();
        findMostCommonElement.search(numberList);
    }
}

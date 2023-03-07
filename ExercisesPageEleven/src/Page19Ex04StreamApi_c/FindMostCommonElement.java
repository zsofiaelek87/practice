package Page19Ex04StreamApi_c;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindMostCommonElement {

    public void search(List<Integer> numberList){

        numberList.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .ifPresent(kv -> System.out.println(kv.getKey()));

    }


    public void searchV2(List<Integer> numberList){
        Map<Integer,Integer> numberFrequencyMap = numberList.stream()
                .collect(Collectors.toMap(
                        k -> k,
                        v -> 1,
                        (v1,v2) -> v1+v2
                ));

        Optional<Map.Entry<Integer, Integer>> result = numberFrequencyMap.entrySet().stream()
                .max((kv1,kv2) -> kv1.getValue() - kv2.getValue());

        if (result.isPresent()){
            System.out.println(result.get().getKey());
        }

    }
}

package com.example.springpractice.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class CharCounter {

    List<String> stringInputList = new ArrayList<>();

    public Map<String,Integer> countCharacters(List<String> stringInputList){
        Map<String,Integer> characterFrequencyMap = stringInputList.stream()
                .collect(Collectors.toMap(
                        k-> k,
                        v-> 1,
                        (v1,v2)->v1+v2
                ));
        return characterFrequencyMap;

    }

}

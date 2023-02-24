package task13_BannedWords_FilterAggregatorV2;

import java.util.Arrays;
import java.util.stream.Collectors;

public class EmailFilter implements Filter{
    @Override
    public String filter(String input) {
        String[] splittedText = input.split("[0-9a-zA-Z]*@[0-9a-zA-Z]*\\.[a-zA-Z]*");
        String results = Arrays.stream(splittedText)
                .collect(Collectors.joining("#"));
        return results;
    }
}

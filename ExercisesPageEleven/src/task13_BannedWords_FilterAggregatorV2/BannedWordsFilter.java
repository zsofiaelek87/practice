package task13_BannedWords_FilterAggregatorV2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class BannedWordsFilter implements Filter{

    private final Set<String> bannedWords = Set.of("Lorem", "ipsum");


    @Override
    public String filter(String input) {

        for (String bannedWord : bannedWords) {
            String[] splittedText = input.split(bannedWord);
            input = Arrays.stream(splittedText)
                    .collect(Collectors.joining("*"));
        }
        return input;
    }
}

package task13_BannedWords_FilterAggregator.filters;

import task13_BannedWords_FilterAggregator.UserInputText;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class BWFilter implements Filter {

    private static final String[] words = UserInputText.getSplitedText();
    private static final Set<String> bannedWords = new HashSet<>(Arrays.asList("Lorem", "ipsum"));


    @Override
    public void doOnSuccess() {

        Set<String> filteredWords = new HashSet<>();
        for (int i = 0; i < words.length; i++) {
            if (bannedWords.contains(words[i])) {
                words[i].replace("[\s]", "***");
                filteredWords.add(words[i]);
            } else filteredWords.add(words[i]);
            //       String results = Arrays.stream(words)
            //               .collect(Collectors.joining("***"));
            //       System.out.println(results);
        }
        filteredWords.forEach(System.out::println);
    }
}

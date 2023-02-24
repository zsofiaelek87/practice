package task13_BannedWords_FilterAggregator.filters;

import task13_BannedWords_FilterAggregator.UserInputText;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class BWordsFilter implements Filter{

    private final String[] splitedText = UserInputText.getSplitedText();

    private final String word = "Lorem";

    private static final Set<String> bannedWords = new HashSet<>(Arrays.asList("Lorem", "ipsum"));

    public boolean check(String word, Set<String> bannedWords) {
        boolean checker = false;
        for (String bannedWord : bannedWords) {
            checker = bannedWord.matches(word);
        }
        return checker;
    }

   //public String filter(String[] splitedText, boolean checker){

  //  }



    @Override
    public void doOnSuccess() {
        System.out.println(check(word, bannedWords));
    }
}

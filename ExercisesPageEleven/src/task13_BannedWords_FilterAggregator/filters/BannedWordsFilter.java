package task13_BannedWords_FilterAggregator.filters;

import task13_BannedWords_FilterAggregator.UserInputText;

import java.util.*;
import java.util.stream.Collectors;

public class BannedWordsFilter implements Filter {


    private static final String[] words = UserInputText.getSplitedText();
    private static final Set<String> bannedWords = new HashSet<>(Arrays.asList("Lorem", "ipsum"));

    String[] blacklistedWords = (String[]) bannedWords.toArray();

    public boolean isThisABannedWord(String word, String[] blacklistedWords) {
         for (int i = 0; i <= blacklistedWords.length - 1; i++) {
            if(blacklistedWords[i].equals(word)){
                return true;
            }
        }
        return false;
    }

    public boolean isThisABannedWord(String word, Set<String> bannedWords) {
        boolean checker = false;
        for (String bannedWord : bannedWords) {
            checker = bannedWord.equals(word);
            if(checker){
                break;
            }
        }
        return checker;
    }

    @Override
    public void doOnSuccess() {
        List<String> wordsFilteredOutBanned = new LinkedList<>();
        for (int i = 0; i <= words.length - 1; i++){
            if(isThisABannedWord(words[i],bannedWords)){
                words[i]= "***";
            }
            wordsFilteredOutBanned.add(words[i]);
        }
        String result = wordsFilteredOutBanned.stream()
                .collect(Collectors.joining(" "));
        System.out.println(result);
    }
}

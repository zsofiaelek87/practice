package bannedWords;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        String word = "Lorem";

        Set<String> bannedWords = new HashSet<>();
        bannedWords.add("Lorem");
        bannedWords.add("ipsum");

        boolean checker = false;
        for (String bannedWord : bannedWords) {
                checker = bannedWord.equals(word);
                if(checker){
                    break;
                }
            }
        System.out.println(checker);

        System.out.println(bannedWords.contains(word)); //URISTEN!!!!
        }

    }


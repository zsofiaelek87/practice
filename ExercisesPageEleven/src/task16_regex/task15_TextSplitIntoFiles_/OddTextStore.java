package task16_regex.task15_TextSplitIntoFiles_;

import java.util.ArrayList;
import java.util.List;

public class OddTextStore implements TextStore {

    private final List<String> oddTexts = new ArrayList<>();

    public List<String> getOddTexts() {
        return oddTexts;
    }

    @Override
    public boolean check(String inputText) {
        return new StringChecker().check(inputText);


    }

    @Override
    public void doOnSuccess(String inputText) {
        oddTexts.add(inputText);
    }
}

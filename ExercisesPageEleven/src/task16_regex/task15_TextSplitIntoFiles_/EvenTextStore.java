package task16_regex.task15_TextSplitIntoFiles_;


import java.util.ArrayList;
import java.util.List;

public class EvenTextStore implements TextStore {



    private final List<String> evenTexts = new ArrayList<>();

    public List<String> getEvenTexts() {
        return evenTexts;
    }

    @Override
    public boolean check(String inputText) {
        return new StringChecker().check(inputText);

    }

    @Override
    public void doOnSuccess(String inputText) {
        evenTexts.add(inputText);
    }
}

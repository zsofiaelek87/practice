package task16_regex.task15_TextSplitIntoFiles_;

public class StringChecker {
    public boolean check(String inputText) {

        return inputText != null && inputText.split(" ").length % 2 == 0;

    }
}

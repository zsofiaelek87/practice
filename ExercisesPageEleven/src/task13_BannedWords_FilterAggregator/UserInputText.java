package task13_BannedWords_FilterAggregator;

import java.util.Arrays;
import java.util.List;

public class UserInputText {
    static String text = "Lorem ipsum dolor sit@amet.com, consectetur adipiscing@elit.com Praesent nec suscipit sapien";


    public static String getText() {
        return text;
    }

    public static String[] getSplitedText() {
        return text.split(" ");
    }


}

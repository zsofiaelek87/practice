package task13_BannedWords_FilterAggregator.filters;

import task13_BannedWords_FilterAggregator.UserInputText;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class BlacklistedWordsFilter implements Filter{
    private static final String text = UserInputText.getText();

    private final Map map = new HashMap<String,String>();


    public static String replaceString(Map<String,String> map, String text) {
        String[] splitedText = text.split("\\s");
        for (int i = 0;i<splitedText.length;i++) {
            String val = map.get(splitedText[i]);
            if (val != null) splitedText[i] = val;
        }
        StringBuilder sb = new StringBuilder();
        for (String s : splitedText) {
            if (s == null || s.length() == 0 ) continue;
            sb.append(s).append(' ');
        }
        return sb.toString().trim();
    }


    @Override
    public void doOnSuccess() {

        replaceString(map, text);
    }
}

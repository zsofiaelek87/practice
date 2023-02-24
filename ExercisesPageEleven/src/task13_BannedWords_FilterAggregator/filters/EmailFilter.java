package task13_BannedWords_FilterAggregator.filters;

import task13_BannedWords_FilterAggregator.UserInputText;

import java.util.Arrays;
import java.util.stream.Collectors;

public class EmailFilter implements Filter {

    private static final String text = UserInputText.getText();


    @Override
    public void doOnSuccess() {

        String[] splittedText = text.split("[0-9a-zA-Z]*@[0-9a-zA-Z]*\\.[a-zA-Z]*");
        String results = Arrays.stream(splittedText)
                .collect(Collectors.joining("#"));
        System.out.println(results);
    }
}

package task16_FilingSortingIntoFile;

import java.util.List;

public class TextSplitter {

    private String inputText;

    public String[] splittedText(String inputText){
        String[] splittedText = inputText.split("[/(?=(-[A-Z]))]"); // splitting up text based on "/" and any ?= char [A-Z] after "-" sign
        return splittedText;
    }
}

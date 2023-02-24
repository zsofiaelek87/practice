package task16_regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        final String inputText = "2022/bevallas/003-123-546-zoli@gmail.com";

        Pattern pattern = Pattern.compile("([0-9]*)/([a-z]*)/(.*)-(.*)");
        Matcher matcher = pattern.matcher(inputText);

        if(matcher.matches()){
            System.out.println(matcher.group(1));
        }
    }
}

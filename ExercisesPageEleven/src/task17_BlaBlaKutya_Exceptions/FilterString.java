package task17_BlaBlaKutya_Exceptions;

public class FilterString {

    private final UserInput userInput;

    public FilterString(UserInput userInput){
        this.userInput = userInput;
    }

    public String filter(){
        String finalText = userInput.getInputText().substring((userInput.getStartNumber()-1), userInput.getEndNumber());
        return finalText;
    };
}

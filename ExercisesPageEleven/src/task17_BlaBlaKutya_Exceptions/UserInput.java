package task17_BlaBlaKutya_Exceptions;

public class UserInput {
    private final int startNumber;

    private final int endNumber;

    private final String inputText;

    public UserInput(int startNumber, int endNumber, String inputText) throws IncorrectIndexException {
        if (startNumber > endNumber || startNumber < 0 || endNumber >= inputText.length()){
            throw new IncorrectIndexException();
        }
        this.startNumber = startNumber;
        this.endNumber = endNumber;
        this.inputText = inputText;
    }

    public int getStartNumber() {
        return startNumber;
    }

    public int getEndNumber() {
        return endNumber;
    }

    public String getInputText() {
        return inputText;
    }

    @Override
    public String toString() {
        return "UserInput{" +
                "startNumber=" + startNumber +
                ", endNumber=" + endNumber +
                ", inputText='" + inputText + '\'' +
                '}';
    }
}

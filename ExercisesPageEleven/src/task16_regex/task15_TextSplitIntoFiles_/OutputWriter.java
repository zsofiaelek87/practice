package task16_regex.task15_TextSplitIntoFiles_;

import java.io.FileWriter;
import java.io.PrintWriter;

public class OutputWriter {


    private final EvenTextStore evenTextStore;
    private final OddTextStore oddTextStore;

    public OutputWriter(EvenTextStore evenTextStore, OddTextStore oddTextStore) {
        this.evenTextStore = evenTextStore;
        this.oddTextStore = oddTextStore;
    }

    public void printToFile(){
        try(FileWriter fileWriter = new FileWriter("countwords.csv");
            PrintWriter printWriter = new PrintWriter(fileWriter)){
            evenTextStore.getEvenTexts().stream()
                    .forEach(word -> {
                        printWriter.print(word.split(" ").length + " ");
                        printWriter.println(word);
                    });
            oddTextStore.getOddTexts().stream()
                    .forEach(word -> {
                        printWriter.print(word.split(" ").length + " ");
                        printWriter.println(word);
                    });
        }
        catch (Exception e){

        }
    }
}

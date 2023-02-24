package task16_regex.task15_TextSplitIntoFiles_;

public class Main {
    public static void main(String[] args) {
        StoreAggregator storeAggregator = new StoreAggregator();

        InputReader inputReader = new InputReader(storeAggregator);
        OutputWriter outputWriter = new OutputWriter(storeAggregator.getEvenTextStore(), storeAggregator.getOddTextStore());

        outputWriter.printToFile();
    }
}

package task16_regex.task15_TextSplitIntoFiles_;

import java.util.Scanner;

public class InputReader {

    private static final String STOP = "STOP";

    private final StoreAggregator storeAggregator;

    public InputReader(StoreAggregator storeAggregator) {
        this.storeAggregator = storeAggregator;
    }

    public void readText() {

        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                String input = scanner.nextLine();
                if (STOP.equals(input)) {
                    break;
                } else {
                    storeAggregator.storeText(input);
                }
            }
        }
    }
}

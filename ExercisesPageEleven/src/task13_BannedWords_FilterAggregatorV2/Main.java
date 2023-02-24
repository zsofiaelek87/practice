package task13_BannedWords_FilterAggregatorV2;



public class Main {
    public static void main(String[] args) {

        String input = "Lorem ipsum dolor sit@amet.com, consectetur adipiscing@elit.com Praesent nec suscipit sapien";

        FilterAggregator filterAggregator = new FilterAggregator();
        filterAggregator.filter(input);
    }
}

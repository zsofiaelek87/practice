package task13_BannedWords_FilterAggregatorV2;

import java.util.List;

public class FilterAggregator {

    private final List<Filter> filters = List.of(new BannedWordsFilter(), new EmailFilter());

    public void filter(String input){
        for(Filter f:filters){
            input = f.filter(input);
        }
        System.out.println(input);
    }

}

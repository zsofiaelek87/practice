package task13_BannedWords_FilterAggregator;

import task13_BannedWords_FilterAggregator.filters.*;

import java.util.List;

public class FilterAggregator {

    private final List<Filter> filters = List.of(new BannedWordsFilter(), new EmailFilter());

    public void filter(){
        for(Filter f:filters ){
                 f.doOnSuccess();
            }
        }
    }


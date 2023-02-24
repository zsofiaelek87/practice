package task16_regex.task15_TextSplitIntoFiles_;

import java.util.List;

public class StoreAggregator {



    private final EvenTextStore evenTextStore = new EvenTextStore();
    private final OddTextStore oddTextStore = new OddTextStore();

    private final List<TextStore> textStores = List.of(evenTextStore, oddTextStore);



    public EvenTextStore getEvenTextStore() {
        return evenTextStore;
    }

    public OddTextStore getOddTextStore() {
        return oddTextStore;
    }

    public void storeText(String inputText){
        for(TextStore t:textStores ){
            if (t.check(inputText)){
                t.doOnSuccess(inputText);
            }
        }
    }
}

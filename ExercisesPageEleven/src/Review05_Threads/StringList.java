package Review05_Threads;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class StringList {
    private final List<String> words = new CopyOnWriteArrayList<>(); // hashmap > concurrenthashmap, minden ami immutable thread stable(Boolean, Integer, Double, Long, Char, String, BigDecimal)
    private final List<String> texts = new ArrayList<>();

    public void add(String word){
      words.add(word);
    }

    public synchronized void addText(String text){
        texts.add(text);
    }
}

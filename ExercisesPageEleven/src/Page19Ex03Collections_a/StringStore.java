package Page19Ex03Collections_a;

import java.util.ArrayList;
import java.util.List;

public final class StringStore {
    private final List<String> stringList= new ArrayList<>();

    public void addToList(String item){
        stringList.add(item);
    }

    public void removeFromList(String item){
        stringList.remove(item);
    }

    public int searchList(String item){
        return stringList.indexOf(item);
    }

    public void printList(){
        stringList.forEach(s -> System.out.println(s));
    }

}

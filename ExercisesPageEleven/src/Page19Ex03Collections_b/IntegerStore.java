package Page19Ex03Collections_b;

import java.util.HashSet;
import java.util.Set;

public class IntegerStore {
    private Set<Integer> integerSet = new HashSet<>();

    public void addToSet(Integer number){
        integerSet.add(number);
    };

    public void removeFromSet(Integer number){
        integerSet.remove(number);
    }

    public boolean checkIfSetIncludes(Integer number){
        return  integerSet.contains(number);
    }

    public void printSet(){
        integerSet.forEach(i -> System.out.println(i));
    }
}

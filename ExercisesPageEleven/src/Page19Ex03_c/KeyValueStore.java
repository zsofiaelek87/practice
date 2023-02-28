package Page19Ex03_c;

import java.util.HashMap;
import java.util.Map;

public class KeyValueStore {
    private Map<Integer, String>map = new HashMap<>();

    public void addKeyValue(Integer key, String value){
        map.put(key, value);
    }

    public void removeKey(Integer key){
        map.remove(key);
    }
    public String returnItem(Integer key){
        return map.get(key);
    }

    public void printItems(){
        map.entrySet().forEach(p-> System.out.println(p.getKey()+" "+p.getValue()));
    }
}

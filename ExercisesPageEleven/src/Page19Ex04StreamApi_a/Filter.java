package Page19Ex04StreamApi_a;

import java.util.List;
import java.util.stream.Collectors;

public class Filter {
    public List<String> filter(List<String> stringList){
        return stringList.stream()
                .filter(s -> s.startsWith("a"))
                .collect(Collectors.toList());
        
    }
}

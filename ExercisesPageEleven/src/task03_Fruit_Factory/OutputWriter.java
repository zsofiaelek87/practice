package task03_Fruit_Factory;

import java.util.Set;

public class OutputWriter {
    public void printToConsole(Set<Fruit> fruits){
        fruits.stream()
                .forEach(fruit -> System.out.println(fruit));
    }

}

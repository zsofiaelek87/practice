package task03_Fruit_Factory;

import java.util.HashSet;
import java.util.Set;

public class Basket {

    private final Set<Fruit> fruits = new HashSet<>();

    public void addFruit(Fruit fruit){
        fruits.add(fruit);
    }

    @Override
    public String toString() {
        return "Basket{" +
                "fruits=" + fruits +
                '}';
    }
}

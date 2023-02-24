package task03_Fruit_Factory;

public class FruitFactory {
    public Fruit getFruit(String fruitType){
        if (fruitType == null){
            return null;
        }
        if ("A".equalsIgnoreCase(fruitType)) {
            return new Apple();
        } else if ("K".equalsIgnoreCase(fruitType)){
            return new Pear();
        } else if("S".equalsIgnoreCase(fruitType)){
            return new Plum();
        }
        return null;
    }
}

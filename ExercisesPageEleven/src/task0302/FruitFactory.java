package task0302;

public class FruitFactory {
    public Fruit getFruit(String fruitType){
        if (fruitType == null){
            return null;
        }
        if (fruitType.equalsIgnoreCase("A")) {
            return new Apple();
        } else if (fruitType.equalsIgnoreCase("K")){
            return new Pear();
        } else if(fruitType.equalsIgnoreCase("S")){
            return new Plum();
        }
        return null;
    }
}

package task03_Fruit_Factory;



import java.util.List;

public class Main {
    public static void main(String[] args) {

        FruitFactory fruitFactory = new FruitFactory();

   /*     Fruit fruit1 = fruitFactory.getFruit("A");
          Fruit fruit2 = fruitFactory.getFruit("K");
          Fruit fruit3 = fruitFactory.getFruit("S");
*/

        UserInputReader userInputReader = new UserInputReader();

        List<String> userInputFruits = userInputReader.readInput();
        Basket basket = new Basket();
        for (String i:userInputFruits) {
            Fruit newFruit = fruitFactory.getFruit(i);
            basket.addFruit(newFruit);
        }
        System.out.println(basket);

    }
}




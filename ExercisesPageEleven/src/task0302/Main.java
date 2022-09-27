package task0302;



import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        FruitFactory fruitFactory = new FruitFactory();

        Fruit fruit1 = fruitFactory.getFruit("A");
        fruit1.createFruit();

        Fruit fruit2 = fruitFactory.getFruit("K");
        fruit2.createFruit();

        Fruit fruit3 = fruitFactory.getFruit("S");
        fruit3.createFruit();

        UserInputReader userInputReader = new UserInputReader();
        OutputWriter outputWriter = new OutputWriter();

        Set<String> userInputFruits = userInputReader.readInput();

        outputWriter.printToConsole(userInputFruits);

    }
}




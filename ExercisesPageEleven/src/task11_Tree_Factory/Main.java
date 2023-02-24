package task11_Tree_Factory;

public class Main {
    public static void main(String[] args) {
        PlantFactory plantFactory = new PlantFactory();

        Plant plant1 = plantFactory.getPlant("T");
        Plant plant2 = plantFactory.getPlant("B");

    }
}

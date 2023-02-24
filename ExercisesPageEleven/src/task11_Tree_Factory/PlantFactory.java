package task11_Tree_Factory;



public class PlantFactory {
    public Plant getPlant(String plantType) {
        if (plantType == null) {
            return null;
        }
        if ("T".equalsIgnoreCase(plantType)) {
            return new Tree();
        } else if ("B".equalsIgnoreCase(plantType)) {
            return new Bush();
        }
        return null;
    }
}

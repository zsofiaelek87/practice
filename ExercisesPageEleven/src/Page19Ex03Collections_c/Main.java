package Page19Ex03Collections_c;

public class Main {
    public static void main(String[] args) {
        KeyValueStore keyValueStore = new KeyValueStore();

        keyValueStore.addKeyValue(1,"hjgd");
        keyValueStore.addKeyValue(2,"ghfdjd");
        keyValueStore.addKeyValue(3,"kljgd");

        keyValueStore.printItems();

        keyValueStore.removeKey(2);

        keyValueStore.printItems();
    }
}

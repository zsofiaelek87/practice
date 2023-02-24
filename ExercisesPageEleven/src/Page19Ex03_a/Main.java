package Page19Ex03_a;

public class Main {
    public static void main(String[] args) {

        StringStore stringStore = new StringStore();
        stringStore.addToList("item1");
        stringStore.addToList("item2");
        stringStore.addToList("item3");

        int result = stringStore.searchList("item3");
        System.out.println(result);

        stringStore.printList();

        stringStore.removeFromList("item2");

        stringStore.printList();

        result= stringStore.searchList("item3");
        System.out.println(result);


    }
}

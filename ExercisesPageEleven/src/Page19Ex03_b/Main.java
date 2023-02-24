package Page19Ex03_b;

public class Main {
    public static void main(String[] args) {

        IntegerStore integerStore = new IntegerStore();

        integerStore.addToSet(1);
        integerStore.addToSet(2);
        integerStore.addToSet(3);

        integerStore.printSet();

        integerStore.removeFromSet(2);

        integerStore.printSet();

        System.out.println(integerStore.checkIfSetIncludes(1));
        System.out.println(integerStore.checkIfSetIncludes(2));
    }
}

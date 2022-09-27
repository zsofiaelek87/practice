package task02;

public class Main {
    public static void main(String[] args) {
        Milk milk1 = new MilkLactoseFree(FatType.LOW, PackageType.BAG, Volume.L1);
        Milk milk2 = new MilkLactose(FatType.LOW, PackageType.BAG, Volume.L1);

        Client client1 = new Client("Mark",true);
        Client client2 = new Client("Tom",false);

        Shop shop = new Shop();
        shop.add(milk1);
        shop.add(milk2);
        shop.enter(client2);
        shop.enter(client1);


    }
}

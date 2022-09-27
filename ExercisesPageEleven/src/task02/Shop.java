package task02;

import java.util.ArrayList;
import java.util.List;

public class Shop{
    List<Milk> milks = new ArrayList<>();
    public void add(Milk milk){
        milks.add(milk);
    }

    public void enter(Client client){
        if(client.getBad()){
            throw new IllegalArgumentException("Bad clients cannot enter!!!!!!!!");
        }
        System.out.println("Client entered the shop");
        if(!milks.isEmpty()){
            client.buy(milks.get(0));
            milks.remove(0);
        }
    }


}

package task02_Milk_Enums;

import java.util.Objects;

public class Client {
    private String name;
    private boolean bad;

    public Client(String name, Boolean bad) {
        this.name = name;
        this.bad = bad;
    }

    public void buy(Milk milk){
        System.out.println("I bought this: " + milk);
    }

    public String getName() {
        return name;
    }

    public boolean getBad() {
        return bad;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBad(boolean bad) {
        this.bad = bad;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return Objects.equals(name, client.name) && Objects.equals(bad, client.bad);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, bad);
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", goodBad=" + bad +
                '}';
    }


}

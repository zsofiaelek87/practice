package task03;

import java.util.Objects;

public abstract class Fruit{

    private Weight weight;
    private boolean isBio;

    public Fruit(Weight weight, boolean isBio) {
        this.weight = weight;
        this.isBio = isBio;
    }

    public Weight getWeight() {
        return weight;
    }

    public boolean isBio() {
        return isBio;
    }

    public void setWeight(Weight weight) {
        this.weight = weight;
    }

    public void setBio(boolean bio) {
        isBio = bio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fruit fruit = (Fruit) o;
        return isBio == fruit.isBio && weight == fruit.weight;
    }

    @Override
    public int hashCode() {
        return Objects.hash(weight, isBio);
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "weight=" + weight +
                ", isBio=" + isBio +
                '}';
    }
}

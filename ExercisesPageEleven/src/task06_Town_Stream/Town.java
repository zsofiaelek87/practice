package task06_Town_Stream;

import java.util.Objects;

public final class Town {
    private final String name;

    private final int numberOfCitizens;

    private final Country country;

    public Town(String name, int numberOfCitizens, Country country) {
        this.name = name;
        this.numberOfCitizens = numberOfCitizens;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfCitizens() {
        return numberOfCitizens;
    }

    public Country getCountry() {
        return country;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Town town = (Town) o;
        return numberOfCitizens == town.numberOfCitizens && Objects.equals(name, town.name) && country == town.country;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, numberOfCitizens, country);
    }

    @Override
    public String toString() {
        return "Town{" +
                "name='" + name + '\'' +
                ", numberOfCitizens=" + numberOfCitizens +
                ", country=" + country +
                '}';
    }
}

import java.util.Objects;

public class Car {
    private String brand;
    private String plate;
    private int numberOfSeats;

    public Car(String brand, String plate, int numberOfSeats) {
        this.brand = brand;
        this.plate = plate;
        this.numberOfSeats = numberOfSeats;
    }

    public String getBrand() {
        return brand;
    }

    public String getPlate() {
        return plate;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return numberOfSeats == car.numberOfSeats && Objects.equals(brand, car.brand) && Objects.equals(plate, car.plate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, plate, numberOfSeats);
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", plate='" + plate + '\'' +
                ", numberOfSeats=" + numberOfSeats +
                '}';
    }


}

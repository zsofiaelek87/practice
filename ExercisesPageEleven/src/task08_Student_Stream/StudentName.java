package task08_Student_Stream;

import com.github.javafaker.Faker;

import java.util.Objects;

public class StudentName {

    Faker faker = new Faker();
    String name = faker.name().firstName();

    public String getname() {
        return name;
    }

    public StudentName() {
        this.name = name;
    }

    @Override
    public String toString() {
        return "StudentName{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentName that = (StudentName) o;
        return Objects.equals(faker, that.faker) && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(faker, name);
    }
}

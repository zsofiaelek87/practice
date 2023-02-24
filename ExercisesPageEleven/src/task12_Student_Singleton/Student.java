package task12_Student_Singleton;

import java.util.Objects;

public final class Student {

    private static final Student STUDENT = new Student("Bela", 18, "KAHJVR");
    private final String name;
    private final int age;
    private final String neptunCode;


    private Student(String name, int age, String neptunCode) {
        this.name = name;
        this.age = age;
        this.neptunCode = neptunCode;
    }

    public static Student getInstance(){
        return STUDENT;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getNeptunCode() {
        return neptunCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name) && Objects.equals(neptunCode, student.neptunCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, neptunCode);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", neptunCode='" + neptunCode + '\'' +
                '}';
    }
}

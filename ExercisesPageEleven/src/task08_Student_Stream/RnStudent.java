package task08_Student_Stream;

public class RnStudent {
    private final String name;
    private final int age;
    private final String neptunCode;
    StudentName studentName = new StudentName();
    StudentAge studentAge = new StudentAge();

    StudentNeptunCode studentNeptunCode = new StudentNeptunCode();


    public RnStudent() {
        this.name = studentName.getname();
        this.age = studentAge.getStudentAge();
        this.neptunCode = studentNeptunCode.generateRandomId();
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
    public String toString() {
        return "RnStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", neptunCode='" + neptunCode + '\'' +
                                '}';
    }
}

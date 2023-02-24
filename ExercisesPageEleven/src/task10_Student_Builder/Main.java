package task10_Student_Builder;

public class Main {
    public static void main(String[] args) {
        Student student1 = new StudentBuilder2("Bela").setAge(20).build();
        System.out.println(student1);

    }
}

package task12_Student_Singleton;

public class Main {
    public static void main(String[] args) {
        Student student1 = Student.getInstance();
        Student student2 = Student.getInstance();

        System.out.println(student1);
        System.out.println(student2);
    }
}

package task08_Student_Stream;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Dorothy", 18, "KANDVB");
        Student student2 = new Student("Marcus", 15, "8UBVKX");
        Student student3 = new Student("Micah", 24, "07BHEY");
        Student student4 = new Student("Elizabeth", 22, "YE4O64");
        Student student5 = new Student("Lillian", 28, "XI2EA5");
        Student student6 = new Student("Grace", 29, "2DHFOL");
        Student student7 = new Student("William", 23, "7MFJ2V");
        Student student8 = new Student("Peter", 19, "9GFL30");
        Student student9 = new Student("Amelia", 17, "IDXLFX");
        Student student10 = new Student("Trevor", 30, "IDG9AJ");
        Student student11 = new Student("Justin", 21, "Q6ZMD9");
        Student student12 = new Student("Jake", 25, "NBN0JA");
        Student student13 = new Student("Piers", 18, "8V50SG");
        Student student14 = new Student("Emily", 20, "QUEGNG");
        Student student15 = new Student("Abigail", 21, "OO0JZ1");

        Set<Student> students = new HashSet<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);
        students.add(student7);
        students.add(student8);
        students.add(student9);
        students.add(student10);
        students.add(student11);
        students.add(student12);
        students.add(student13);
        students.add(student14);
        students.add(student15);

        //Hány olyan Hallgató van, aki legalább 25 éves, de még nem töltötte be a 30-at
        System.out.println("Hány olyan Hallgató van, aki legalább 25 éves, de még nem töltötte be a 30-at?");
        students.stream()
                .filter(student -> student.getAge() > 24)
                .filter(student -> student.getAge() < 30)
                .forEach(System.out::println);

        long filteredStudents =  students.stream()
                .filter(student -> student.getAge() > 24)
                .filter(student -> student.getAge() < 30)
                .count();

        System.out.println(filteredStudents);

        //Hány olyan Hallgató van, akinek a kódjában nincsenek számok?
        System.out.println("Hány olyan Hallgató van, akinek a kódjában nincsenek számok?\n");
        students.stream()
                .filter(student -> !student.getNeptunCode().contains("0"))
                .filter(student -> !student.getNeptunCode().contains("1"))
                .filter(student -> !student.getNeptunCode().contains("2"))
                .filter(student -> !student.getNeptunCode().contains("3"))
                .filter(student -> !student.getNeptunCode().contains("4"))
                .filter(student -> !student.getNeptunCode().contains("5"))
                .filter(student -> !student.getNeptunCode().contains("6"))
                .filter(student -> !student.getNeptunCode().contains("7"))
                .filter(student -> !student.getNeptunCode().contains("8"))
                .filter(student -> !student.getNeptunCode().contains("9"))
                .forEach(System.out::println);

        long filteredStudents2 =  students.stream()
                .filter(student -> !student.getNeptunCode().contains("0"))
                .filter(student -> !student.getNeptunCode().contains("1"))
                .filter(student -> !student.getNeptunCode().contains("2"))
                .filter(student -> !student.getNeptunCode().contains("3"))
                .filter(student -> !student.getNeptunCode().contains("4"))
                .filter(student -> !student.getNeptunCode().contains("5"))
                .filter(student -> !student.getNeptunCode().contains("6"))
                .filter(student -> !student.getNeptunCode().contains("7"))
                .filter(student -> !student.getNeptunCode().contains("8"))
                .filter(student -> !student.getNeptunCode().contains("9"))
                .count();

        System.out.println(filteredStudents2);

        System.out.println("Random Student Name:");
        StudentName student100 = new StudentName();
        System.out.println(student100.getname());

        System.out.println("Random Student Neptun Code:");
        StudentNeptunCode student200 = new StudentNeptunCode();
        System.out.println(student200.generateRandomId());

        System.out.println("Random Student Age:");
        StudentAge student300 = new StudentAge();
        System.out.println(student300.getStudentAge());

        System.out.println("Random Student:");
        RnStudent rnStudent = new RnStudent();
        System.out.println(rnStudent.toString());

        System.out.println("Random Student SET:");

        System.out.println("How many student do you want?");

        Scanner scanner = new Scanner(System.in);
            int i = scanner.nextInt();
        scanner.close();

        int j=0;
        Set<RnStudent> randomStudents = new HashSet<>();
        while(j<i){
            RnStudent rnStudentI = new RnStudent();
            randomStudents.add(rnStudentI);
            System.out.println(rnStudentI.toString());;
            j++;
        }

        printToFile(randomStudents);

        System.out.println("Random Student Set Filters");
        randomStudents.stream()
                .filter(rns -> rnStudent.getAge() > 24)
                .filter(rns -> rnStudent.getAge() < 30)
                .forEach(System.out::println);

    }

    public static void printToFile(Set<RnStudent> rnStudents){
        try(FileWriter fileWriter = new FileWriter("rnStudents.txt");
            PrintWriter printWriter = new PrintWriter(fileWriter)){
            rnStudents.stream()
                    .sorted((rn1,rn2)->rn1.getName().compareTo(rn2.getName()))
                    .forEach(number -> printWriter.println(number));
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
package task10_Student_Builder;

public class StudentBuilder2 {
        private String name;
        private int age = 18;

        public StudentBuilder2(String name){
            this.name = name;
        }

    public StudentBuilder2 setAge(int age) {
        this.age = age;
        return this;
    }

    public Student build(){
            Student student = new Student(name,age);
            return student;
        }
    }


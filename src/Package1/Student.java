package Package1;

public class Student extends Person {
    public Student(String name, String family, int age, int studentId) {
        super(name, family, age);
        StudentId = studentId;
    }

    int StudentId;

    public void print() {
        System.out.println("StudentId:" + StudentId);
    }
}

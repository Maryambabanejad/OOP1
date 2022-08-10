package Package1;

public class Teacher extends Person {
    public Teacher(String name,String family, int age,int teacherCod ){
     super(name, family, age);
     TeacherCod = teacherCod;
    }
    int TeacherCod;
    public void print() {
        System.out.println("Teacher Cod is :" + TeacherCod);
    }
}

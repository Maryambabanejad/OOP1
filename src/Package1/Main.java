package Package1;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Ali","Rezaei",30,1);
        Student student2 = new Student("Reza","Molaei",35,2);
        Teacher teacher1 = new Teacher("Hamed","Sohrabi",29,8605);

        teacher1.printPersonInfo();
        teacher1.print();
        student1.printPersonInfo();
        student1.print();
        student2.printPersonInfo();
        student2.print();

    }
}

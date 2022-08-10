package Package1;

public class Person {
    String Name;
    String Family;
    int Age;

    // Constructive constraction
    public Person(String name, String family, int age) {
        Name = name;
        Family = family;
        Age = age;

    }

    public void printPersonInfo() {
        System.out.println("Name:" + Name + "\t" + "Family:" + "\t" + Family + "\t" + "Age:" + "\t" + Age);
    }
}


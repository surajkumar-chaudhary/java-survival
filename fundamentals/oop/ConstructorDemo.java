package fundamentals.oop;

class Student {

    String name;
    int age;

    // No-argument constructor
    Student() {
        name = "Unknown";
        age = 0;

        System.out.println("No-argument constructor called");
    }

    // Parameterized constructor
    Student(String studentName, int studentAge) {
        name = studentName;
        age = studentAge;

        System.out.println("Parameterized constructor called");
    }

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class ConstructorDemo {

    public static void main(String[] args) {

        Student student1 = new Student();

        student1.displayInfo();

        System.out.println();

        Student student2 = new Student("Ram", 20);

        student2.displayInfo();
    }
}
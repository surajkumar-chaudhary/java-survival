package fundamentals.oop;

class Student {

    // Fields
    String name;
    int age;

    // Method
    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class ClassObjectDemo {

    public static void main(String[] args) {

        // Creating first object
        Student student1 = new Student();

        student1.name = "Ram";
        student1.age = 20;

        // Creating second object
        Student student2 = new Student();

        student2.name = "Sita";
        student2.age = 21;

        // Calling methods
        student1.displayInfo();

        System.out.println();

        student2.displayInfo();
    }
}
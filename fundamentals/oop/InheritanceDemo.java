package fundamentals.oop;

// Parent class / Superclass
class Person {

    private String name;
    private int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayPersonInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Child class / Subclass
class Teacher extends Person {

    private String subject;

    Teacher(String name, int age, String subject) {

        // Calls the constructor of Person
        super(name, age);

        this.subject = subject;
    }

    void displayTeacherInfo() {

        // Inherited method from Person
        displayPersonInfo();

        System.out.println("Subject: " + subject);
    }

    void teach() {
        System.out.println("The teacher is teaching " + subject + ".");
    }
}

public class InheritanceDemo {

    public static void main(String[] args) {

        Teacher teacher1 =
                new Teacher("Ram Sharma", 35, "Java");

        teacher1.displayTeacherInfo();
        teacher1.teach();
    }
}
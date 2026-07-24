package fundamentals.oop;

class Employee {

    String name;
    int age;
    double salary;

    // Parameterized constructor
    Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    void displayInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Salary: Rs. " + this.salary);
    }
}

public class ThisKeywordDemo {

    public static void main(String[] args) {

        Employee employee1 =
                new Employee("Ram", 25, 45000);

        Employee employee2 =
                new Employee("Sita", 28, 55000);

        employee1.displayInfo();

        System.out.println();

        employee2.displayInfo();
    }
}
package fundamentals.oop;

class Calculator {

    // Method with two integer parameters
    int add(int number1, int number2) {
        return number1 + number2;
    }

    // Same method name with three integer parameters
    int add(int number1, int number2, int number3) {
        return number1 + number2 + number3;
    }

    // Same method name with two double parameters
    double add(double number1, double number2) {
        return number1 + number2;
    }

    // Same method name with String parameters
    String add(String text1, String text2) {
        return text1 + text2;
    }
}

public class MethodOverloadingDemo {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        int result1 = calculator.add(10, 20);
        int result2 = calculator.add(10, 20, 30);
        double result3 = calculator.add(5.5, 4.5);
        String result4 = calculator.add("Hello ", "Java");

        System.out.println("Two integers: " + result1);
        System.out.println("Three integers: " + result2);
        System.out.println("Two doubles: " + result3);
        System.out.println("Two strings: " + result4);
    }
}
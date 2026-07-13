package fundamentals.methods;

public class L07MethodWithParameter{
    static void greet(String name){
        System.out.println("Hello "+ name);
    }
    static void showAge( int age){
        System.out.println("Your age is " + age);
    }
    public static void main(String[] args){
        greet("Suraj");
        greet("Laxman");
        showAge(33);
    }
}
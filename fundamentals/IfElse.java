package fundamentals;
import java.util.Scanner;
class IfElse{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int age;

        System.out.println("Enter your age:");
        age = sc.nextInt();

        if(age >= 18){
            System.out.println("Your are eligible to vote.");
        }
        else{
            System.out.println("You are not eligible to vote.");
        }
        sc.close();
    }
}
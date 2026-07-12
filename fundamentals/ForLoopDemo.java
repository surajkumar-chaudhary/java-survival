package fundamentals;
import java.util.Scanner;

public class ForLoopDemo {

    public static void main ( String[] args){
        int sum = 0;
        int number;
        int i;
        Scanner sc = new Scanner(System.in);
        for (i=1; i<=5; i++){
            System.out.println("Enter number" + i + ":");
            number = sc.nextInt();
            if (number%2 == 0){
                  sum = sum + number;   
            }
        }
        System.out.println(sum);
        sc.close();

    }
}
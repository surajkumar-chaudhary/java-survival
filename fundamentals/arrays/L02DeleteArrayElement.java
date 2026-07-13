package fundamentals.arrays;

import java.util.Scanner;

public class L02DeleteArrayElement{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[5];

        for(int i = 0 ; i < numbers.length; i++){
            System.out.println("Enter number:" + (i+1) + ":");
            numbers[i] = sc.nextInt();
        }
        //ask user the position to delete

        System.out.println("Enter the position to delete:");
        int position = sc.nextInt();

        if(position < 1 || position > numbers.length){
            System.out.println("Invalid position");
        } else{
            int index = position - 1;
            for(int i = index; i < numbers.length-1; i++ ){
                numbers[i] = numbers[i+1];
            }  
        }

        System.out.println("Array after deletion:");

        for(int i = 0; i< numbers.length -1 ; i++){
            System.out.println(numbers[i]);
        }
        sc.close();
    }
}
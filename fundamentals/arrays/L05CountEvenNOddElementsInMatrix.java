package fundamentals.arrays;
import java.util.Scanner;

class L05CountEvenNOddElementsInMatrix{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int evenCount = 0;
        int oddCount = 0;
        int[][] matrix = new int[2][2];

        for(int row = 0; row < matrix.length; row++){
            for(int column = 0; column< matrix[row].length; column++){
                System.out.println("Enter elements:  ["+row+"]["+column+"]");
                matrix[row][column] = sc.nextInt();
            }
        }
        for(int row = 0; row<matrix.length; row++){
            for(int column = 0; column < matrix[row].length; column++){
                if(matrix[row][column]%2==0){
                    evenCount++;
                }
                else{
                    oddCount++;
                }
            }
        }
        System.out.println("Even count is " + evenCount);
        System.out.println("Odd count is "+ oddCount);
        sc.close();
    }
}
package fundamentals.arrays;
import java.util.Scanner;

class L04MatrixEvenSum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[][] matrix = new int[2][2];
        int sum = 0;

        for(int row = 0; row < matrix.length; row++){
            for(int column = 0; column< matrix[row].length; column++){
                System.out.println("Enter element [ " + row + "][" + column + "]:");
                matrix[row][column] = sc.nextInt();  
            }
        }
        System.out.println("Matrix:");

        for(int row = 0; row < matrix.length; row++){
            for(int column = 0; column < matrix[row].length; column++){
                System.out.print(matrix[row][column]);
            }
            System.out.println();

        }
        System.out.println();
        for(int row = 0; row < matrix.length; row++){
            for(int column = 0; column < matrix[row].length; column++){
                if( matrix[row][column]%2 == 0){
                    sum += matrix[row][column];
                }
            }
        }
        System.out.println("Sum of even elements is "+ sum);
    sc.close();
    }
}
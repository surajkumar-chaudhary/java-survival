package fundamentals.arrays;
import java.util.Scanner;

class L03Matrix{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[][] matrix = new int[2][2];

        for( int row = 0 ; row < matrix.length; row++){
            for(int column = 0 ; column < matrix[row].length; column++){
                System.out.println("Enter element[" + row + "][" + column + "]:");
                matrix[row][column] = sc.nextInt();
            }
        }
        System.out.println();

        for( int row = 0 ; row < matrix.length; row++){
            for(int column = 0; column < matrix[row].length ; column++){
                System.out.print(matrix[row][column] + " ");
            }
            System.out.println();
        }

    sc.close();

    }
}
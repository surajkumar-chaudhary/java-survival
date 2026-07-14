package fundamentals.methods;

public class L09ArrayMethod {
    static int findEvenSum(int[] numbers){
        int sum = 0;
        for(int i = 0; i<numbers.length; i++){
            if(numbers[i]%2 == 0){

                sum = sum + numbers[i];
            }
        }
        return sum;
    }
    public static void main(String[] args){
        int[] values = {1, 2, 3, 4, 5, 6};
        int result = findEvenSum(values);
        System.out.println("The sum of even number is " + result);
    }
}

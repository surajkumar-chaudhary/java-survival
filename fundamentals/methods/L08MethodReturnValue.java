package fundamentals.methods;

public class L08MethodReturnValue{
    static int multiply(int a, int b){
        int product = a*b;
        return product;
    }
    public static void main(String[] args){
        int result = multiply(2,3);
        System.out.println("The product is "+result);
    }
}
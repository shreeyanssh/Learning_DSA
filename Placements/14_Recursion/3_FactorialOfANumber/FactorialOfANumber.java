public class FactorialOfANumber {
    public static int factorial(int n){
        if(n == 0){
            return 1;
        }
        int fact = n * factorial(n-1);
        return fact;
    }
    public static void main(String[] args){
        int n = 4;
        System.out.println(factorial(n));
    }
}

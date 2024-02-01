public class FibonacciNumber {
    public static int fibonacciNumber(int n){
        if(n == 0 || n == 1){
            return n;
        }
        int number = fibonacciNumber(n-1) + fibonacciNumber(n-2);
        return number;
    }
    public static void main(String[] args){
        int n = 7;
        System.out.println(fibonacciNumber(n));
    }    
}

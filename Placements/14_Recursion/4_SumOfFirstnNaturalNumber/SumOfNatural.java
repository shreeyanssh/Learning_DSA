public class SumOfNatural {
    public static int sumOfNatural(int n){
        if(n == 1){
            return 1;
        }
        int sum = n + sumOfNatural(n-1);
        return sum;
    }
    public static void main(String[] args){
        int n = 5;
        System.out.println(sumOfNatural(n));
    }    
}

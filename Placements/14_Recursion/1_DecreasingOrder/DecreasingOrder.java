public class DecreasingOrder {
    public static void printDecOrder(int n){
        if(n == 0){
            return;
        }
        
        System.out.print(n + " ");
        printDecOrder(n-1);
    }
    public static void main(String[] args){
        int n = 10;
        printDecOrder(n);
    }    
}

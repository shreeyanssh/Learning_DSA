public class IncreasingOrder {
    public static void incOrder(int n){
        if(n == 0){
            return;
        }
        incOrder(n-1);
        System.out.print(n + " ");

    }
    public static void main(String[] args){
        int n = 10;
        incOrder(n);
    }
}

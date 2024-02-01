public class MaxSum{
    public static void maxSum(int anyArray[]){
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        
        for(int i = 0; i < anyArray.length; i++){
            int start = i;
            for(int j = i; j < anyArray.length; j++){
                int end = j;
                sum = 0;
                for(int k = start; k <= end; k++){
                    sum += anyArray[k];
                    if(sum > maxSum){
                        maxSum = sum;
                    }
                }
                System.out.print(sum);
                System.out.println();
            }
        }
        System.out.println("Max Sum = " + maxSum);
        
    }
    public static void main(String[] main){
        int myArray[] = {2,4,6,8,10};

        maxSum(myArray);
    }

}

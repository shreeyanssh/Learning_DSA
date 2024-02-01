public class PrefixMaxSum{
    public static void maxSum(int anyArray[]){
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;

        int prefixArray[] = new int[anyArray.length];
        prefixArray[0] = anyArray[0];

        for(int i = 1; i < prefixArray.length; i++){
            prefixArray[i] = prefixArray[i-1] + anyArray[i];
        }

        for(int i = 0; i < anyArray.length; i++){
            int start = i;
            for(int j = i; j < anyArray.length; j++){
                int end = j;
                
                sum = start == 0 ? prefixArray[0] :   //if than
                prefixArray[end] + prefixArray[start-1]; //else
                
                if(sum > maxSum){
                    maxSum = sum;
                }
            }
        }
        System.out.println("Max Sum = " + maxSum);
        
    }
    public static void main(String[] main){
        int myArray[] = {2,4,6,8,10};

        maxSum(myArray);
    }

}

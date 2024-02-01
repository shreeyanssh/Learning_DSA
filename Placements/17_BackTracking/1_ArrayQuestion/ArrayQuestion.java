public class ArrayQuestion {
    public static void arrayQuestion(int[] arr,int i , int val){
        //base case
        if(i == arr.length){
            return;
        }   

        //recursion
        arr[i] = val;
        arrayQuestion(arr, i+1, val+1);    //Function Call 
        arr[i] = arr[i] -2;               //Backtracking Step
    }

    public static void printArr(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args){
        int arr[] = new int[5];
        arrayQuestion(arr, 0, 1);
        printArr(arr);
    }    
}

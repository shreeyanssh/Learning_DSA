public class InsertionSorting {
    public static void insertionSorting(int arr[]){
        for(int i = 1; i < arr.length; i++){
            int currNo = arr[i];
            int prevNo = i-1;
            while(prevNo >= 0 && arr[prevNo] > currNo){
                arr[prevNo+1] = arr[prevNo];
                prevNo--;
            }
            arr[prevNo+1] = currNo;
        }
    }
    
    public static void printArray(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i] + " ");
        }
    }
    public static void main(String[] args){
        int arr[] = {3,5,2,6,7,9,1,4,8};
        insertionSorting(arr);
        printArray(arr);
    }
}

public class BinarySearch {
    public static void main(String[] args){
        int[] arr = {10,12,34,45,65,34,45,54};

        int key = 12;

        int index = 10;

        //sorting the array.
        for(int i = 0; i < arr.length - 1; i++){
            for(int j = 0; j < arr.length -1-i; j++){
                if(arr[j] > arr[j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j+1] = temp;
                }
            }
        }
        
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }

        int start = 0;
        int end = arr.length - 1;
        int mid = (start + end)/2;
        while(start <= end){

            mid = (start + end)/2;

            if(key == arr[mid]){
                index = mid;
                break;
            }
            else if(key > arr[mid]){
                start = mid + 1;
            }
            else if(key < arr[mid]){
                end = mid - 1;
            }
        }

        System.out.println("The key is at index "+ index);

    }    
}

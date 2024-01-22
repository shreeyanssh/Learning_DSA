public class ReverseArray {
    public static void main(String[] args){
        int[] arr = {2,4,5,6,8,10,11};
        int last = arr.length -1;

        for(int i = 0; i < arr.length/2; i++){    
            //swap
            int temp = arr[i];
            arr[i] = arr[last - i ];
            arr[last - i] = temp;            
        }

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }    
}

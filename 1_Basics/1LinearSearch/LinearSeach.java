public class LinearSeach{
    public static void main(String[] args){
        int[] arr = {10,12,34,45,65,12,34,45,54};

        int key = 12;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == key){
                System.out.println("The key is at "+ i + " index.");
            }
        }
     }
}
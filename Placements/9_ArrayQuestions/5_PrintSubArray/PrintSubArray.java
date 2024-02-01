public class PrintSubArray {
    public static void printSubArray(int anyArray[]){
        for(int i = 0; i < anyArray.length; i++){
            int start = i;
            for(int j = i; j < anyArray.length; j++){
                int end = j;
                for(int k = start; k <= end; k++){
                    System.out.print(anyArray[k]+" ");
                }
                System.out.println();
            }
        }
    }
    public static void main(String[] args){
        int newArray[] = {2,4,6,8,10};

        printSubArray(newArray);
    }       
}

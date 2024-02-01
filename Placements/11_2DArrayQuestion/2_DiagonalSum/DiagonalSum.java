public class DiagonalSum {

    public static void diagonalSum(int arr[][]){
        //Primary Diagonal
        int sumOne = 0;
        for(int i = 0; i < arr.length; i++){
            sumOne += arr[i][i];
        }

        //Secondary Diagonal
        int row = 0;
        int col = arr[0].length-1;
        int sumTwo = 0;

        while(row <= arr.length && col >= 0){
            sumTwo += arr[row][col];
            row++;
            col--;
        }

        //printing
        System.out.println("The Sum of the Primary Diagnal: " + sumOne);
        System.out.println("The Sum of the Secondary Diagnal: " + sumTwo);
        
    }

    public static void printTwoD(int arr[][]){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String [] args){
        //Making Array
        int arr[][] = {{1,2,3,4},
                    {5,6,7,8},
                    {9,10,11,12},
                    {13,14,15,16}};

        // printTwoD(arr);
        diagonalSum(arr);

    }    
}

   

    
    

   


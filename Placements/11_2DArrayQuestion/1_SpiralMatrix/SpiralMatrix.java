public class SpiralMatrix {

    public static void printTwoD(int arr[][]){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void printSpiral(int arr[][]){
        int startRow = 0;
        int startCol = 0;
        int endRow = arr.length-1;
        int endCol = arr[0].length-1;

        while(startRow <= endRow && startCol <= endCol){
            //top
            for(int j = startCol; j <= endCol; j++){
                System.out.print(arr[startRow][j] + " ");
            }
            
            //right
            for(int i = startRow+1; i <= endRow; i++ ){
                System.out.print(arr[i][endCol] + " ");
            }

            //bottom
            for(int j = endCol-1; j >= startCol; j--){
                System.out.print(arr[j][endRow]);
            }

            // left
            for(int i = endRow -1 ; i >= startRow+1; i--){
                System.out.print(arr[i][startCol]);
            }

            startCol++;
            startRow++;
            endCol--;
            endRow--;
        }
    }

    public static void main(String [] args){
        //Making Array
        int arr[][] = {{1,2,3,4},
                       {5,6,7,8},
                       {9,10,11,12},
                       {13,14,15,16}};

        // printTwoD(arr);
        printSpiral(arr);

    }    
}

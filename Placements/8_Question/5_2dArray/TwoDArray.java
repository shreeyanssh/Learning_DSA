import java.util.Scanner;

public class TwoDArray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int rows = sc.nextInt();
        int colm = sc.nextInt();

        int numbers[][] = new int[rows][colm];

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < colm; j++){
                numbers[i][j] = sc.nextInt();        
            }
        }

        int x = sc.nextInt();

         for(int i = 0; i < rows; i++){
            for(int j = 0; j < colm; j++){
                if(numbers[i][j] == x){
                    System.out.println("The number is present at: "+ i + " "+ j);
                }      
            }
        }

        // this code is to print the matrix or 2D array
        //  for(int i = 0; i < rows; i++){
        //     for(int j = 0; j < colm; j++){
        //         System.out.print(numbers[i][j] + " ");      
        //     }
        //     System.out.println(" ");
        // }

        sc.close();

    }
}
import java.util.Scanner;

public class OddOrEven {
    public static void oddOrEven(int input){
        int bitMask = 1;

        if((bitMask & input)== 0){
            System.out.println("The Number is Even");
        }
        else{
            System.out.println("The number is Odd.");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        
        oddOrEven(input);
        
        sc.close();
    }    
}

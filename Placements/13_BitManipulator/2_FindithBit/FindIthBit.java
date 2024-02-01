import java.util.Scanner;

public class FindIthBit {
    public static void ithBitFinder(int input, int i){
        int bitMask = 1;
        
        System.out.println("The ith Bit is: " + 
            (((bitMask << i) & input) >> i ));

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the Number: ");
        int input = sc.nextInt();
        System.out.print("Input the i th bit: ");
        int i = sc.nextInt();

        ithBitFinder(input,i);
        
        sc.close();
    }    
}

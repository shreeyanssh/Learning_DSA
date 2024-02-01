public class RepeatedMultiplication{
    public static int repeatedMultiplication(int number, int powerNumber){
        if(powerNumber == 1){
            return number;
        }
        
        int result = number * repeatedMultiplication(number, powerNumber-1);
        
        return result;

    }
    public static void main(String[] args){
        int number = 2;
        int powerNumber = 10;
        System.out.println(repeatedMultiplication(number,powerNumber));
    }
}
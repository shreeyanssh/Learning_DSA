public class OptimisedMul{
    public static int repeatedMul(int number, int powerNumber){
        if(powerNumber == 1){
            return number;
        }
        
        //even case
        if(isEven(powerNumber)){
            int result = repeatedMul(number, powerNumber/2) * 
                            repeatedMul(number, powerNumber/2);;
            
            return result;
        }
        
        //odd case
        int result = number * repeatedMul(number, powerNumber/2)*
                                    repeatedMul(number, powerNumber/2);
        
        return result;

    }

    public static boolean isEven(int number){
        if((number % 2 ) == 0){
            return true;
        }
        
        return false;
    }
    public static void main(String[] args){
        int number = 2;
        int powerNumber = 9;
        System.out.println(repeatedMul(number,powerNumber));
    }
}
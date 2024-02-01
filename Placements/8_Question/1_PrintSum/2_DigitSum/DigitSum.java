public class DigitSum{
    public static void main(String[] args){
        System.out.println("The sum of the numbers is " + digitSum(1234123123123123L));
    }

    public static int digitSum(long number){
        int sum = 0;

        if(number < 10){
            return -1;
        }

        
        while(number > 0){
            long digit = number % 10;

            sum += digit;

            number /= 10;
        }
        
        return sum;

    }
}
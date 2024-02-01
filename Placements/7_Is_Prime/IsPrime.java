public class IsPrime{
    public static void main(String[] args){
        int count = 0;
        for(int inputNumber = 0; inputNumber <= 10000; inputNumber++){
            if(isPrime(inputNumber)){
                count++;
                System.out.println(inputNumber + " is a Prime Number.");
                if(count == 1000){
                    System.out.println("Exiting the Loop.");
                    break;
                }
            }
        }

    }

    public static boolean isPrime(int testNumber){
        if(testNumber == 1){
            return false;
        }

        for(int i = 2; i <= testNumber/2; i++){
            if(testNumber % i == 0){
                return false;
            }
        }

        return true;
    }
}


// public class IsPrime{
//     public static void main(String[] args){
//         for(int noToCheck = 0; noToCheck <= 5; noToCheck++){
//             if(isPrime(noToCheck)){
//                 System.out.println(noToCheck + " is a Prime Number.");
//             }
//             else{
//                 System.out.println(noToCheck + " is not a Prime Number.");
//             }
//         }

//         int noOfPrime =0;

//         for(int noToCheck = 0; noToCheck <= 5; noToCheck++){
    
//             if(isPrime(noToCheck)){
//                 noOfPrime = noOfPrime + 1;
//             }
//         }

//         System.out.println(noOfPrime + " is the number of Prime Numbers found." );

//     }

//     public static boolean isPrime(int n){
//         if(n == 1){
//             return false;
//         }

//         for(int i = 2; i <= n/2; i++){
//             if(n % i == 0){
//                 return false;
//             }
//         }

//         return true;

//     }
// }
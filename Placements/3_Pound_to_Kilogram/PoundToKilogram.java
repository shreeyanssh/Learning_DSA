import java.util.Scanner;

public class PoundToKilogram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("No. of Pounds: ");
        double noOfPounds = sc.nextDouble();

        double noOfKilograms = noOfPounds*0.45359237;

        System.out.println("No. of Kilograms: " + noOfKilograms);
    }
}
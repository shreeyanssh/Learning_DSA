import java.util.Scanner;

public class SumOfSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of x: ");
        double x = scanner.nextDouble();
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        
        double sum = calculateSeriesSum(x, n);
        System.out.println("Sum of the series: " + sum);
        
        scanner.close();
    }
    
    public static double calculateSeriesSum(double x, int n) {
        double sum = 1.0; // Initializing sum with the first term (1)
        
        for (int i = 2; i <= n; i++) {
            sum += Math.pow(x, i);
        }
        
        return sum;
    }
}

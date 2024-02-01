import java.util.Scanner;

public class ArrayQuestion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the size of the array (n): ");
        int n = scanner.nextInt();
        
        int[] array = new int[n];
        
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        
        System.out.print("Enter the value to be added (k): ");
        int k = scanner.nextInt();
        
        addValueToArray(array, k);
        
        System.out.println("Array after adding " + k + " to all elements:");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        
        scanner.close();
    }
    
    public static void addValueToArray(int[] array, int k) {
        for (int i = 0; i < array.length; i++) {
            array[i] += k;
        }
    }
}

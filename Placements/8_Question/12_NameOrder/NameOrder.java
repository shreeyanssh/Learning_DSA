import java.util.*;

public class NameOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of names: ");
        int n = scanner.nextInt();
        
        String[] names = new String[n];
        
        System.out.println("Enter the names:");
        for (int i = 0; i < n; i++) {
            names[i] = scanner.next();
        }
        
        sortNames(names);
        
        System.out.println("Names in ascending order:");
        for (String name : names) {
            System.out.println(name);
        }
        
        scanner.close();
    }
    
    public static void sortNames(String[] names) {
        Arrays.sort(names);
    }
}

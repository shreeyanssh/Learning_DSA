import java.util.Scanner;

public class StringQuestion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        System.out.print("Enter the character to count: ");
        char targetChar = scanner.next().charAt(0);
        
        int count = countOccurrences(input, targetChar);
        System.out.println("Number of occurrences of '" + targetChar + "': " + count);
        
        scanner.close();
    }
    
    public static int countOccurrences(String str, char target) {
        int count = 0;
        
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target) {
                count++;
            }
        }
        
        return count;
    }
}

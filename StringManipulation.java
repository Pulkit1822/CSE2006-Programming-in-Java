import java.util.Scanner;

public class StringManipulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        
        int length = inputString.length();
        System.out.println("Length of the string: " + length);
        
        String trimmedString = inputString.trim();
        System.out.println("Trimmed string: " + trimmedString);
        
        String upperCaseString = inputString.toUpperCase();
        System.out.println("Uppercase string: " + upperCaseString);
        
        System.out.print("Enter the starting index: ");
        int startIndex = scanner.nextInt();
        System.out.print("Enter the ending index: ");
        int endIndex = scanner.nextInt();
        
        if (startIndex >= 0 && endIndex <= length && startIndex <= endIndex) {
            String substring = inputString.substring(startIndex, endIndex);
            System.out.println("Substring from index " + startIndex + " to " + endIndex + ": " + substring);
        } else {
            System.out.println("Invalid index values. Please ensure 0 <= startIndex <= endIndex <= string length.");
        }
        
        // Reverse the string
        String reversedString = new StringBuilder(inputString).reverse().toString();
        System.out.println("Reversed string: " + reversedString);
        
        scanner.close();
    }
}

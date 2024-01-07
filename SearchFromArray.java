import java.util.*;

public class SearchFromArray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();
        int numbers[] = new int[size];

        // Input
        System.out.println("Enter the array elements:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.println("Enter the number to be searched in array");
        int x = sc.nextInt();

        // Output
        boolean found = false;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == x) {
                System.out.println(x + " found at index " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println(x + " not found in the array.");
        }

        sc.close();
    }
}

import java.util.LinkedList;
import java.util.Scanner;

public class UsingToArray {
    public static void main(String[] args) {
        LinkedList<String> links = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter colors (type 'exit' to finish):");
        while (true) {
            String color = scanner.nextLine();
            if (color.equals("exit")) {
                break;
            }
            links.add(color);
        }
        scanner.close();
        String[] colors = links.toArray(new String[links.size()]);
        System.out.println("colors:");
        for (String color : colors)
            System.out.println(color);
    }
}

import java.io.*;
import java.util.*;
import java.util.regex.*;

public class IPValidator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            String inputIP = scanner.nextLine();
            boolean isValidIP = isIPAddressValid(inputIP);
            System.out.println(isValidIP);
        }
    }

    private static boolean isIPAddressValid(String ipAddress) {
        String octetPattern = "([01]?\\d{0,2}|2[0-4]\\d|25[0-5])";
        String ipPattern = octetPattern + "\\." + octetPattern + "\\." + octetPattern + "\\." + octetPattern;
        return Pattern.matches(ipPattern, ipAddress);
    }
}
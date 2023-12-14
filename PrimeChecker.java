import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;
import static java.lang.System.in;

class PrimeChecker {

    void printPrimes(int... numbers) {
        for (int num : numbers) {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

    boolean isPrime(int n) {
        if (n < 2) {
            return false;
        } else if (n == 2) {
            return true;
        } else if (n % 2 == 0) {
            return false;
        }

        int sqrt = (int) Math.sqrt(n);
        for (int i = 3; i <= sqrt; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

public class Solution {

    public static void main(String[] args) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(in));

            int num1 = Integer.parseInt(bufferedReader.readLine());
            int num2 = Integer.parseInt(bufferedReader.readLine());
            int num3 = Integer.parseInt(bufferedReader.readLine());
            int num4 = Integer.parseInt(bufferedReader.readLine());
            int num5 = Integer.parseInt(bufferedReader.readLine());

            PrimeChecker primeChecker = new PrimeChecker();

            primeChecker.printPrimes(num1);
            primeChecker.printPrimes(num1, num2);
            primeChecker.printPrimes(num1, num2, num3);
            primeChecker.printPrimes(num1, num2, num3, num4, num5);

            Method[] methods = PrimeChecker.class.getDeclaredMethods();
            Set<String> methodNames = new HashSet<>();
            boolean hasOverload = false;

            for (Method method : methods) {
                if (methodNames.contains(method.getName())) {
                    hasOverload = true;
                    break;
                }
                methodNames.add(method.getName());
            }

            if (hasOverload) {
                throw new Exception("Overloading not allowed");
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
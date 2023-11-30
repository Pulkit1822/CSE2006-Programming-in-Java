public class PowerCalculator {

    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Please provide two numbers as arguments.");
            return;
        }

        try {
            double a = Double.parseDouble(args[0]);
            double b = Double.parseDouble(args[1]);
            double result = Math.pow(a, b);

            System.out.println(a + " raised to the power of " + b + " is " + result);
        } catch (NumberFormatException e) {
            System.out.println("Both arguments must be numbers.");
        }
    }
}
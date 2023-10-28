public class InvoiceTest {
    public static void main(String[] args) {
        Invoice invoice = new Invoice("12345", "Widget", 10, 12.99);

        System.out.println(invoice);

        // Calculate the payment amount using the Payable interface
        Payable payable = invoice;
        System.out.println("\nPayment amount: $" + payable.getPaymentAmount());
    }
}

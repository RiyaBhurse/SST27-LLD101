public class OrderService{

    void checkout(String customerEmail, double subtotal, EmailClient email,  ITaxService taxService) {
        double total = taxService.totalWithTax(subtotal);
        email.send(customerEmail, "Thanks! Your total is " + total);
        System.out.println("Order stored (pretend DB).");
    }
}
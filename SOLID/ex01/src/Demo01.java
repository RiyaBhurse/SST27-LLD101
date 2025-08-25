
public class Demo01 {
    static EmailClient email = new EmailClient();
    static OrderService orderService = new OrderService();
    static TaxImplementation taxService = new TaxImplementation();
    public static void main(String[] args) {
        orderService.checkout("a@shop.com", 100.0, email, taxService);
    }
}

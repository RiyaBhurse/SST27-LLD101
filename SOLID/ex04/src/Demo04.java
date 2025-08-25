
public class Demo04 {
    public static void main(String[] args) {

        PaymentService paymentService = new UPI(499);
        System.out.println(paymentService.pay());

        paymentService = new WALLET(299);
        System.out.println(paymentService.pay());

        paymentService = new CARD(199);
        System.out.println(paymentService.pay());

    }
}

public class CARD extends PaymentService {

    public CARD(double amount) {
        setAmount(amount);
    }

    @Override
    public String pay() {
        return "Charged card: " + getAmount();
    }

  
}

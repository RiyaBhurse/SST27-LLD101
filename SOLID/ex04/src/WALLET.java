public class WALLET extends PaymentService {
    public WALLET(double a) {
        setAmount(a);
    }
    @Override
    public String pay(){
        return "Wallet debit: " + getAmount();
    }
}

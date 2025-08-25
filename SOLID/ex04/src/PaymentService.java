
public abstract class PaymentService {
    private double amount;
    public abstract String pay();
    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
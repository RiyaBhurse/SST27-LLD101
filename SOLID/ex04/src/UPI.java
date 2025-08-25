public class UPI extends PaymentService {
   public UPI(double a) {
       setAmount(a);
   }

    @Override
    public String pay(){
        return "Paid via UPI: " + getAmount();
    }


}

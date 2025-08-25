public class TaxImplementation implements ITaxService {
    double taxRate = 0.18;
    public double totalWithTax(double subtotal) {
        return subtotal + subtotal * taxRate;
    }
    
}

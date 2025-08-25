public class Express implements ShippingCostCalculator {
    private Shipment s;

    Express(Shipment s) {
        this.s = s;
    }

    @Override
    public double cost() {
        return 80 + 8 * s.getWeightKg();
    }
    
}

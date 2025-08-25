public class Standard implements ShippingCostCalculator {
    private Shipment s;

    Standard(Shipment s) {
        this.s = s;
    }

    @Override
    public double cost() {
        return 50 + 5 * s.getWeightKg();
    }
}

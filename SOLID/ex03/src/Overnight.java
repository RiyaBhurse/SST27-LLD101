public class Overnight implements ShippingCostCalculator {
    private Shipment s;

    Overnight(Shipment s) {
        this.s = s;
    }

    @Override
    public double cost() {
        return 120 + 10 * s.getWeightKg();
    }
}

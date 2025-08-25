public class Demo03 {
    public static void main(String[] args) {
        ShippingCostCalculator expressType = new Express(new Shipment(2.0));
        ShippingCostCalculator standardType = new Standard(new Shipment(2.0));
        ShippingCostCalculator overnightType = new Overnight(new Shipment(2.0));

        System.out.println(expressType.cost());
        System.out.println(standardType.cost());
        System.out.println(overnightType.cost());
    }
}

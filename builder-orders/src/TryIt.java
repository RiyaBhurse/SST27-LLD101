import com.example.orders.*;
import java.util.List;

public class TryIt {
    public static void main(String[] args) {
        OrderLine l1 = new OrderLine.Builder().sku("A").quantity(2).unitPriceCents(100).build();
        OrderLine l2 = new OrderLine.Builder().sku("B").quantity(1).unitPriceCents(200).build();
        // Order o = new Order("o2", "a@b.com");
        Order o = new Order.Builder().id("o2").customerEmail("a@b.com").discountPercent(10).addLine(l1).addLine(l2).build();

        // o.setDiscountPercent(10);
        System.out.println("Before: " + o.totalAfterDiscount());
        // l1.setQuantity(999); // demonstrates mutability leak
        System.out.println("After:  " + o.totalAfterDiscount());
        System.out.println("=> In the solution, totals remain stable due to defensive copies.");
    }
}

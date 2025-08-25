interface OrderRepository {
    void save(String id);
}

class SqlOrderRepository implements OrderRepository {
    public void save(String id) {
        System.out.println("Saved order " + id + " to SQL");
    }
}

public class OrderController {
    private final OrderRepository repo;

    public OrderController() {
        this(new SqlOrderRepository());
    }

    public OrderController(OrderRepository repo) {
        this.repo = repo;
    }

    void create(String id) {
        repo.save(id);
        System.out.println("Created order: " + id);
    }
}
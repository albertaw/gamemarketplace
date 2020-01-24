import java.util.ArrayList;

public class Exchange {
    private ArrayList<Order> orders = new ArrayList<>();

    public String display(ArrayList<Order> orders) {
        if (orders.size() > 0) {
            return "ID: " + orders.get(0).getId() + " Price: " + orders.get(0).getPrice();
        }
        return "There are no orders";
    }

    public ArrayList<Order> getOrders() {
        return orders;
    }

    public void setOrders(ArrayList<Order> orders) {
        this.orders = orders;
    }
}

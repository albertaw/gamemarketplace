import java.util.ArrayList;

public class Exchange {
    private ArrayList<Order> orders = new ArrayList<>();

    public String display(ArrayList<Order> orders) {
        String result = "";
        if (orders.size() > 0) {
            for (Order order : orders) {
                result += "ID: " + order.getId() + " Price: " + order.getPrice() + "\n";
            }
            return result;
        }
        return "There are no orders";
    }

    public ArrayList<Order> getOrders() {
        return orders;
    }

    public void setOrders(ArrayList<Order> orders) {
        this.orders = orders;
    }

    public void add(Order order) {
        orders.add(order);
    }
}

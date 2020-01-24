public class Order {
    private String id;
    private String price;

    public Order(String id, String price) {
        this.id = id;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public String getPrice() {
        return price;
    }
}

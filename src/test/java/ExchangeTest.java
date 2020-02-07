import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;
import static org.mockito.Mockito.*;

public class ExchangeTest {
    @Test
    public void exchange_displays_message_when_there_are_no_orders() {
        Exchange exchange = new Exchange();
        ArrayList<Order> orders = exchange.getOrders();

        String actual = exchange.display(orders);
        String expected = "There are no orders";

        assertEquals(expected, actual);
    }

    @Test
    public void exchange_displays_one_order() {
        Exchange exchange = new Exchange();
        Order order = new Order("1234", "$10.00");

        exchange.add(order);

        String actual = exchange.display(exchange.getOrders());
        String expected = "ID: 1234 Price: $10.00\n";
        assertEquals(expected, actual);
    }

    @Test
    public void exchange_displays_multiple_orders() {
        Exchange exchange = new Exchange();
        Order order1 = new Order("1234", "$10.00");
        Order order2 = new Order("5678", "$15.00");

        exchange.add(order1);
        exchange.add(order2);

        String actual = exchange.display(exchange.getOrders());
        String expected = "ID: 1234 Price: $10.00\nID: 5678 Price: $15.00\n";
        assertEquals(expected, actual);
    }
}

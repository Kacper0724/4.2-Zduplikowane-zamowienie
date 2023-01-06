import java.time.LocalDate;
import java.util.*;

public class Application{
    public static void main(String[] args) {
        Set<Order> OrderSet = new HashSet<>();
        OrderSet.add(new Order("keyboard", 2022, 12, 20));
        OrderSet.add(new Order("keyboard", 2022, 12, 20));
        OrderSet.add(new Order("keyboard", 2022, 12, 20));

        System.out.println(OrderSet.size());
    }
}

class Order {
    private String product;
    LocalDate orderDate;

    public Order(String product, int year, int month, int day) {
        this.product = product;
        this.orderDate = LocalDate.of(year, month, day);
    }

    public String toString() {
        return "Product: " + product + "\nDate: " + getOrderDate().getYear() + "." + getOrderDate().getMonthValue() + "." + getOrderDate().getDayOfMonth();
    }

    public String getProduct() {
        return product;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public int hashCode() {
        return Objects.hash(product, orderDate);
    }

    public boolean equals(Object o) {
        Order e = (Order) o;
        return (product.equals(e.getProduct())) &&
                (orderDate.getYear() == e.getOrderDate().getYear()) &&
                (orderDate.getMonthValue() == e.getOrderDate().getMonthValue()) &&
                (orderDate.getDayOfMonth() == e.getOrderDate().getDayOfMonth());
    }
}
package exs.ex13;

public class testOrders {
    public static void main(String[] args) {

        Customer customer1 = new Customer(1, "yolo");
        Product product = new Product(1, "car", 999.99f);
        OrderItem orderItem = new OrderItem(1, 10, product);

        Order order = new Order(customer1);
        order.addItems(orderItem);

        System.out.println(order.toString());

    }
}

package exs.ex13;

import java.util.ArrayList;

public class Order {
    private Customer customer;
    private ArrayList<OrderItem> orderItems;

    public Order(Customer customer) {
        this.customer = customer;
        this.orderItems = new ArrayList<>();
    }

    public Customer getCustomer() {
        return this.customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public ArrayList<OrderItem> getOrderItems() {
        return this.orderItems;
    }

    public void setOrderItems(ArrayList<OrderItem> orderItems) {
        this.orderItems = orderItems;
    }

    public void addItems(OrderItem orderItem){
        this.orderItems.add(orderItem);
    }

    @Override
    public String toString() {
        return "\nOrder ->" +
                "\n\tcustomer: " + this.customer +
                "\n\torderItems: " + this.orderItems;
    }
}

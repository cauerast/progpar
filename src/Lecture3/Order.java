package Lecture3;

import java.util.ArrayList;
import java.util.Date;

public class Order {
    private int id;
    private Date date;
    private Client client;
    private ArrayList<OrderItem> orderItems;

    public Order(){
        this.orderItems = new ArrayList<>();
    }

    public Order(int id, Date date, Client client) {
        this.id = id;
        this.date = date;
        this.client = client;
        this.orderItems = new ArrayList<>();
    }

    public void addOrderItem(int id, float qtd, Product product){
        OrderItem aux = new OrderItem(id, qtd, product);
        this.orderItems.add(aux);
        System.out.println("Item has been successfully added!");
    }

    public int getId() {
        return this.id;
    }

    public Date getDate() {
        return this.date;
    }

    public Client getClient() {
        return this.client;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    @Override
    public String toString() {
        return "\nOrder{" +
                "\nid: " + this.id +
                "\ndate: " + this.date +
                "\nclient: " + this.client +
                '}';
    }

    public float OrderTotalCalculator(){
        for (OrderItem orderItem : this.orderItems) {
            return orderItem.getQtd() * orderItem.getProduct().getPrice();
        }
    }

    // or

    // public float OrderTotalCalculator(){
    //        for(int i = 0; i < this.orderItems.size(); i++){
    //            return this.orderItems.get(i).getQtd() * this.orderItems.get(i).getProduct().getPrice();
    //        }
    //    }
}

package Lecture3;

import java.util.Date;

public class Order {
    private int id;
    private Date date;
    private Client client;

    public Order(){}
    public Order(int id, Date date, Client client) {
        this.id = id;
        this.date = date;
        this.client = client;
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
}

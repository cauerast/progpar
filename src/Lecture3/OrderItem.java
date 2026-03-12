package Lecture3;

import java.util.ArrayList;

public class OrderItem {

    private int id;
    private float qtd;
    private Product product;

    public OrderItem(int id, float qtd, Product product) {
        this.id = id;
        this.qtd = qtd;
        this.product = product;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getQtd() {
        return this.qtd;
    }

    public void setQtd(float qtd) {
        this.qtd = qtd;
    }

    public Product getProduct() {
        return this.product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "OrderItem{" +
                "id=" + id +
                ", qtd=" + qtd +
                ", product=" + product +
                "}";
    }
}

package exs.ex13;

public class OrderItem {
    private int id;
    private int qtd;
    Product product;

    public OrderItem(int id, int qtd, Product product) {
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

    public int getQtd() {
        return this.qtd;
    }

    public void setQtd(int qtd) {
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
        return "\nOrderItem ->" +
                "\n\tid: " + this.id +
                "\n\tqtd: " + this.qtd +
                "\n\tproduct: " + this.product;
    }
}

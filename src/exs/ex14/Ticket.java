package exs.ex14;

public class Ticket {
    private int id;
    private String seat, type;
    private float price;

    public Ticket(int id, String seat, String type, float price) {
        this.id = id;
        this.seat = seat;
        this.type = type;
        this.price = price;
    }

    @Override
    public String toString() {
        return "\nTicket ->" +
                "\n\tid: " + this.id +
                "\n\tseat: '" + this.seat +
                "\n\ttype: " + this.type +
                "\n\tprice: " + this.price;
    }
}

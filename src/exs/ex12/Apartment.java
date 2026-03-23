package exs.ex12;

public class Apartment {
    private int number;
    private int layer;

    public Apartment(int number, int layer) {
        this.number = number;
        this.layer = layer;
    }

    public int getNumber() {
        return this.number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getLayer() {
        return this.layer;
    }

    public void setLayer(int layer) {
        this.layer = layer;
    }

    @Override
    public String toString() {
        return "\nApartment ->" +
                "\n\tnumber: " + this.number +
                "\n\tlayer: " + this.layer;
    }
}

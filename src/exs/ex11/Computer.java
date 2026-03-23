package exs.ex11;

public class Computer {
    private int id;
    private String brand;
    private CPU cpu;

    public Computer(int id, String brand, CPU cpu) {
        this.id = id;
        this.brand = brand;
        this.cpu = cpu;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public CPU getCpu() {
        return this.cpu;
    }

    @Override
    public String toString() {
        return "Computer ->" +
                "id: " + this.id +
                "brand: " + this.brand;
    }
}

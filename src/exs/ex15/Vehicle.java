package exs.ex15;

public abstract class Vehicle {
    protected String brand;
    protected String model;
    protected float velocity;

    public Vehicle(){}
    public Vehicle(String brand, String model, float velocity) {
        this.brand = brand;
        this.model = model;
        this.velocity = velocity;
    }

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public float getVelocity() {
        return this.velocity;
    }

    public void setVelocity(float velocity) {
        this.velocity = velocity;
    }

    public abstract void move();

    public abstract void fuel();
    @Override
    public String toString() {
        return "Vehicle ->" +
                "\n\tbrand: " + this.brand +
                "\n\tmodel: " + this.model +
                "\n\tvelocity: " + this.velocity;
    }
}

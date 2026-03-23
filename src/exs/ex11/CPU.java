package exs.ex11;

public class CPU {
    private String brand;
    private String model;
    private float frequency;

    public CPU(String brand, String model, float frequency) {
        this.brand = brand;
        this.model = model;
        this.frequency = frequency;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public float getFrequency() {
        return frequency;
    }

    public void setFrequency(float frequency) {
        this.frequency = frequency;
    }

    @Override
    public String toString() {
        return "CPU{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", frequency=" + frequency +
                '}';
    }
}

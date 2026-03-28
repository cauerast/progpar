package exs.ex15;

public class ElectricCar extends Vehicle{
    private int batteryLife;

    public ElectricCar(){}
    public ElectricCar(String brand, String model, float velocity, int batteryLife){
        super(brand, model, velocity);
        this.batteryLife = batteryLife;
    }

    public int getBatteryLife() {
        return this.batteryLife;
    }

    public void setBatteryLife(int batteryLife) {
        this.batteryLife = batteryLife;
    }

    @Override
    public void move(){
        System.out.println("Electric car is moving silently");
    }

    @Override
    public void fuel(){
        System.out.println("Charging battery at fast charge station");
    }

    @Override
    public String toString() {
        return "ElectricCar ->" +
                super.toString() +
                "\n\tbatteryLife: " + this.batteryLife;
    }
}

package exs.ex15;

public class Plane extends Vehicle{
    private float maxAltitude;

    public Plane(String brand, String model, float velocity, float maxAltitude){
        super(brand, model, velocity);
        this.maxAltitude = maxAltitude;
    }

    public float getMaxAltitude() {
        return this.maxAltitude;
    }

    public void setMaxAltitude(float maxAltitude) {
        this.maxAltitude = maxAltitude;
    }

    @Override
    public void move(){
        System.out.println("Plane is flying " + this.velocity + "km/h and " + this.maxAltitude + "m");
    }

    @Override
    public void fuel(){
        System.out.println("Fueling w/ plane kerosene");
    }

    @Override
    public String toString() {
        return "Plane ->" +
                super.toString() +
                "\n\tmaxAltitude: " + this.maxAltitude;
    }
}


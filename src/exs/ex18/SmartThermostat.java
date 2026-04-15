package exs.ex18;

public class SmartThermostat implements Device, TemperatureSensor{
    private boolean active = false;

    @Override
    public void on() {
        this.active = true;
        System.out.println("Thermostat on!");
    }

    @Override
    public void off() {
        this.active = false;
        System.out.println("Thermostat off");
    }

    @Override
    public double readTemperature() {
        return 0;
    }
}

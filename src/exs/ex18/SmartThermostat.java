package exs.ex18;

public class SmartThermostat implements Device, TemperatureSensor{


    @Override
    public void on() {
        System.out.println("Thermostat on!");
    }

    @Override
    public void off() {
        System.out.println("Thermostat off");
    }

    @Override
    public double readTemperature() {
        return 0;
    }
}

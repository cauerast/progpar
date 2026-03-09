package exs.ex4;

public class ArCondicionado {
    private String label, model;
    private int temperature;
    private boolean on;

    public ArCondicionado(){};
    public ArCondicionado(String label, String model, int temperature, boolean on){
        setLabel(label);
        setModel(model);
        setTemperature(temperature);
        setOn(on);
    };

    public void setLabel(String label) {
        if(label.length() >= 3){
            this.label = label;
        } else {
            System.out.println("Label needs to more than 3 chars.");
        }
    }
    public String getLabel() {
        return this.label;
    }

    public void setModel(String model) {
        this.model = model;
    }
    public String getModel(){
        return this.model;
    }

    public void setTemperature(int temperature) {
        if(temperature >= 16 && temperature <= 30){
            this.temperature = temperature;
        } else {
            System.out.println("Temperature out of bounds!");
        }
    }
    public int getTemperature(){
        return this.temperature;
    }

    public void setOn(boolean on) {
        this.on = on;
    }
    public boolean isOn() {
        return this.on;
    }

    public void turboMode(){
        if(checkCompressor()){
            setTemperature(16);
        } else {
            System.out.println("Turbo mode: Fail");
        }
    }
    private boolean checkCompressor(){
        return (Math.floor(Math.random() * 10)) > 2;
    }

    public String toString() {
        return "-- Air Conditioning --\n"  +
                "Label: " + getLabel() +
                "\nModel: " + getModel() +
                "\nTemperature: " + getTemperature() +
                "\nisOn:" + (isOn() ? "Yes!" : "No!");
    }
}

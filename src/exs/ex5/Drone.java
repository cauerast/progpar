package exs.ex5;

public class Drone {

    private String code;
    private float height;
    private int battery;
    private boolean flying;

    public Drone(String code, float height, int battery, boolean flying){
        this.code = code;
        setHeight(height);
        setBattery(battery);
        setFlying(flying);
    }

    private void setHeight(float height) {
        if(height >= 0 && height <= 120){
            this.height = height;
        } else {
            System.out.println("-- ERROR -- ");
        }
    }
    public float getHeight() {
        return this.height;
    }

    private void setBattery(int battery){
        if(battery >= 0 && battery <= 100){
            this.battery = battery;
        } else {
            System.out.println("-- Error -- ");
        }
    }
    public int getBattery() {
        return this.battery;
    }

    private void setFlying(boolean flying) {
        this.flying = flying;
    }
    public boolean isFlying() {
        return this.flying;
    }

    public void fly(){
        if(getBattery() > 20 && testEngine()){
            setFlying(true);
            setHeight(2000);
        } else {
            System.out.println("Error to fly :(");
        }
    }

    private boolean testEngine(){
        int random = (int) Math.floor(Math.random() * 10);
        System.out.println("calibrating gps ...");
        return ((int) random < 8);
    }

    public void up(float x){
        setHeight(getHeight() + x);
    }
    public void down(float y){
        setHeight(getHeight() - y);
    }

    public String toString() {
        return "-- DRONE --\n"  +
                "Code: " + this.code +
                "\nHeight: " + getHeight() +
                "\nBettery: " + getBattery() +
                "\nisFlying:" + (isFlying() ? "Yes!" : "No!");
    }
}

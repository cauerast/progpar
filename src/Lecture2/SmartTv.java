package Lecture2;

public class SmartTv {
    private String brand, model;
    private int volume;
    private boolean connected;
    private int volumeIn;

    public SmartTv(){}
    public SmartTv(String brand, String model, int volume){
        this.setBrand(brand);
        this.setModel(model);
        this.setVolume(volume); // para nao perder encapsulamento
        this.connected = false;
    }
    
    public void setBrand(String brand){
        if(brand.length() < 30){ // length is a parameter method because brand (object) calls it
            this.brand = brand;
        } else {
            System.out.println("Invalid brand");
        }
    }
    public String getBrand(){
        return this.brand;
    }

    public void setModel(String model){
        if(Character.isUpperCase(model.charAt(0))){// class method
            this.model = model;
        } else {
            System.out.println("Invalid model");
        }
    }
    public String getModel(){
        return this.model;
    }

    public void setVolume(int volume){
        if(volume >= 0 && volume <= 100) {
            this.volume = volume;
        } else {
            System.out.println("Invalid volume");
        }
    }
    public int getVolume(){ // method aways the same type as your return
        return this.volume;

    }

    public void increaseVolume(int volumeIn){
        setVolume(this.volume + volumeIn);
        System.out.println("Volume is now: " + this.volume);
    }
    public void decreaseVolume(int volumeIn){
        setVolume(this.volume - volumeIn);
        System.out.println("Volume is now: " + this.volume);
    }
    
    public void setConnected(boolean connected){
        this.connected = connected;
    }
    public boolean isConnected(){
        return this.connected;
    }
    
    public void openYoutube(){
        if(this.checkInternet()){
            System.out.println("Youtube has been opened");
        } else {
            System.out.println("You couldn`t open youtube");
        }
    }
    private boolean checkInternet(){ // private methods are called in class, used by a function to reduce code, not allowed in program;
        System.out.println("Checking Wi-Fi...");
        System.out.println("Verifying credentials...");
        System.out.println("Checking IP...");

        // 50% of chance
        int random = (int) (Math.random() * 10); // random is a class method, Math is a class;

        if(random < 5){
            System.out.println("Connected to internet");
            return true;
        } else {
            System.out.println("Problem w/ internet connection!");
            return false;
        }
    }
}

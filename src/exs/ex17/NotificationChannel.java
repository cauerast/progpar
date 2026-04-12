package exs.ex17;

public abstract class NotificationChannel {

    protected String destiny;
    protected String message;

    public NotificationChannel(){}
    public NotificationChannel(String destiny, String message){
        this.destiny = destiny;
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDestiny() {
        return this.destiny;
    }

    public void setDestiny(String destiny) {
        this.destiny = destiny;
    }

    public void showData(){
        System.out.println("Message: " + this.message + "\n to: " + this.destiny);
    }

    public abstract void send();

    @Override
    public String toString() {
        return "\nNotificationChannel: " +
                "\n\tdestiny: " + this.destiny +
                "\n\tmessage: " + this.message;
    }
}

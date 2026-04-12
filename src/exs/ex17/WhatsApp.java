package exs.ex17;

public class WhatsApp extends NotificationChannel{

    private String status;

    public WhatsApp(){
        super();
    }
    public WhatsApp(String destiny, String message, String status){
        super(destiny, message);
        this.status = status;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public void send() {
        System.out.println("Sending wpp message to " + this.destiny +
                "\nMessage: " + this.message);
    }

    public String toString(){
        return "WhatsApp: \n\t" +
                super.toString() +
                "Status: " + this.status;

    }
}

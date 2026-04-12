package exs.ex17;

public class Email extends NotificationChannel{

    private String subject;

    public Email(){
        super();
    }
    public Email(String destiny, String message, String subject) {
        super(destiny, message);
        this.subject = subject;
    }


    public String getSubject() {
        return this.subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public void send() {
        System.out.println("Sending email to " + this.destiny +
                "\nw/ subject: "+ this.subject +
                "\nmessage: " + this.message);
    }

    @Override
    public String toString() {
        return "Email: \n\t" +
                super.toString() +
                "\n\tsubject='" + this.subject;
    }
}

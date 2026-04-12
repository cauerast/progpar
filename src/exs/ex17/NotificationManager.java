package exs.ex17;

import java.util.ArrayList;

public class NotificationManager {
    public static void main(String[] args){
        ArrayList<NotificationChannel> arr = new ArrayList<>();

        Email email = new Email("Dani", "Hello teacher on email", "Saying hi to dani");
        SMS sms = new SMS("Dani", "Hello teacher on sms", "1199000-0000");
        WhatsApp whatsApp = new WhatsApp("Dani", "Hello teacher on WhatsApp", "Sent");

        arr.add(email);
        arr.add(sms);
        arr.add(whatsApp);

        for(NotificationChannel notification: arr){
            notification.send();
        }
    }
}

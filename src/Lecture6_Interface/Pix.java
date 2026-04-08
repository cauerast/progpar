package Lecture6_Interface;

public class Pix implements Payment{
    @Override
    public void authorize(double value) {
        System.out.println("Loading qr code");
        System.out.println("Payment value: $" + value + "authorized");
    }

    @Override
    public void showPaymentInfo() {
        System.out.println("receipt sent by email");
    }
}

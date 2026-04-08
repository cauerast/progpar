package Lecture6_Interface;

public class CreditCard implements Payment{
    @Override
    public void authorize(double value) {
        System.out.println("Verifying credit limit");
        System.out.println("Payment value: $" + value + "authorized");
    }

    @Override
    public void showPaymentInfo() {
        System.out.println("receipt sent by email");
    }
}

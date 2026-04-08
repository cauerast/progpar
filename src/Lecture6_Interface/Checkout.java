package Lecture6_Interface;

public class Checkout {
    public static void main(String[] args) {

        Payment cc = new CreditCard();
        cc.authorize(700);
        cc.showPaymentInfo();

        Payment pix = new Pix();
        pix.authorize(500);
        pix.showPaymentInfo();

        int []a = {1, 2, 4, 5, 6};

        System.out.println(a);


    }
}

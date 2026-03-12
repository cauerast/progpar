package Lecture3;

import java.util.Date;

public class Test {
    public static void main(String[] args) {

        // cliente veio pronto , mostrando a argregaçao e sua independencia

        //objeto todo
        Client cl1 = new Client();
        Client cl2 = new Client(1, "caue", "2131-213-123", "123 road");

        Product pr1 = new Product(100, "mouse", "mouse optico", 180);
        Product pr2 = new Product(200, "Monitor", "widescreen", 900);

        Order ord1 = new Order(10, new Date(), cl2);

        ord1.addOrderItem(1000, 5, pr1);
        ord1.addOrderItem(1001, 2, pr2);

        System.out.println(ord1.toString());
    }
}

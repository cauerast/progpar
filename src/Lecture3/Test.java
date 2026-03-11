package Lecture3;

import java.sql.SQLOutput;
import java.util.Date;

public class Test {
    public static void main(String[] args) {

        // cliente veio pronto , mostrando a argregaçao e sua independencia

        //objeto todo
        Client cl1 = new Client();
        Client cl2 = new Client(1, "caue", "2131-213-123", "123 road");

        Order order = new Order(1, new Date(), cl2);

        System.out.println(order.toString());
    }
}

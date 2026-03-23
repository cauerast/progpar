package exs.ex14;

import java.time.LocalDateTime;

public class testSession {
    public static void main(String[] args){
        Movie m1 = new Movie(1, "Batman", "action", 140);
        Movie m2 = new Movie(2, "Dune", "action", 132);

        LocalDateTime date = LocalDateTime.of(2026, 8, 30, 10, 50);

        Session s1 = new Session(1, date, 1, m1);

        s1.orderTicket(1, "g1", "full", 2.99f);
        s1.orderTicket(2, "g2", "full", 2.99f);
        s1.orderTicket(3, "g3", "full", 2.99f);

        System.out.println(s1);
    }
}

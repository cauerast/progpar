package Lecture4;

import java.time.LocalDateTime;

public class AgencyTest {
    public static void main(String[] args){
        Passenger p1 = new Passenger("Caue", "333");
        System.out.println(p1.toString());

        LocalDateTime data = LocalDateTime.of(2026, 4, 18, 8, 15);
        Fly fly1 = new Fly(909, "Ribeirao Preto", "Sao paulo", data);

        System.out.println(fly1.toString());

        Reservation r1 = new Reservation(123, LocalDateTime.now(), 2, p1, fly1);
        System.out.println(r1.toString());

        // using the reservation, show the fly's destiny;
        System.out.println("\n" + r1.getFly().getDestiny());

        // using the reservation, show the name of the passenger;
        System.out.println("\n" + r1.getPassenger().getName());


    }
}

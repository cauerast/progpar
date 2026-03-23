package exs.ex7;

import java.time.LocalDateTime;

public class testConsultation {
    public static void main(String[] args) {
        Doctor d1 = new Doctor(101, "Dr. Bowser", "hearth");
        Patient p1 = new Patient(326, "Mario", "123-456-678-99");

        LocalDateTime date = LocalDateTime.of(2026, 5, 20, 8, 30);
        Consultation c1 = new Consultation(date, 30.05f, d1, p1);

        System.out.println(c1);
        System.out.println(d1);
        System.out.println(p1);


    }
}

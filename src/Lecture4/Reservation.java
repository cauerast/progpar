package Lecture4;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;

public class Reservation {
    private int code;
    private LocalDateTime data;
    private int armchair;
    private Passenger passenger;
    private Fly fly;

    public Reservation(){}
    public Reservation(int code, LocalDateTime data, int armchair, Passenger passenger, Fly fly) {
        this.code = code;
        this.data = data;
        this.armchair = armchair;
        this.passenger = passenger;
        this.fly = fly;
    }

    public int getCode() {
        return this.code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public LocalDateTime getData() {
        return this.data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public int getArmchair() {
        return this.armchair;
    }

    public void setArmchair(int armchair) {
        this.armchair = armchair;
    }

    public Passenger getPassenger() {
        return this.passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public Fly getFly() {
        return this.fly;
    }

    public void setFly(Fly fly) {
        this.fly = fly;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy 'at' HH:mm:ss");
        return "\nReservation{" +
                "\n\tcode: " + this.code +
                "\n\tdata: " + this.data.format(formatter) +
                "\n\tarmchair: " + this.armchair +
                "\n\tpassenger: " + this.passenger +
                "\n\tfly: " + this.fly;
    }
}

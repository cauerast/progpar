package Lecture4;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Fly {
    private int flyID;
    private String origin, destiny;
    private LocalDateTime data;

    public Fly(){}
    public Fly(int flyID, String origin, String destiny, LocalDateTime data) {
        this.flyID = flyID;
        this.origin = origin;
        this.destiny = destiny;
        this.data = data;
    }

    public int getFlyID() {
        return this.flyID;
    }

    public void setFlyID(int flyID) {
        this.flyID = flyID;
    }

    public String getOrigin() {
        return this.origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestiny() {
        return this.destiny;
    }

    public void setDestiny(String destiny) {
        this.destiny = destiny;
    }

    public LocalDateTime getData() {
        return this.data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy ' at ' HH:mm:ss");
        return "\nFly ->" +
                "\n\tflyID: " + this.flyID +
                "\n\torigin: " + this.origin +
                "\n\tdestiny: " + this.destiny +
                "\n\tdata: " + this.data.format(formatter);
    }
}

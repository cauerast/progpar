package exs.ex14;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Session {
    private int id;
    private LocalDateTime date;
    private int classNum;
    private Movie movie;
    private ArrayList<Ticket> tickets;

    public Session(int id, LocalDateTime date, int classNum, Movie movie) {
        this.id = id;
        this.date = date;
        this.classNum = classNum;
        selectMovie(movie);
        this.tickets = new ArrayList<>();
    }

    public void selectMovie(Movie movie){
        this.movie = movie;
    }

    public void orderTicket(int id, String seat, String type, float price){
        Ticket t = new Ticket(id, seat, type, price);
        this.tickets.add(t);
    }

    @Override
    public String toString() {
        return "\nSession ->" +
                "\n\tid: " + this.id +
                "\n\tdate: " + this.date +
                "\n\tclassNum: " + this.classNum +
                "\n\tmovie: " + this.movie +
                "\n\ttickets: " + this.tickets;
    }
}

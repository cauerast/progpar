package exs.ex9;

import java.util.ArrayList;

public class Team {
    private int id;
    private String name;
    private String coach;
    private ArrayList<Athlete> athletes;

    public Team(int id, String name, String coach) {
        this.id = id;
        this.name = name;
        this.coach = coach;
        this.athletes = new ArrayList<Athlete>();
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCoach() {
        return this.coach;
    }

    public void setCoach(String coach) {
        this.coach = coach;
    }

    public ArrayList<Athlete> getAthletes() {
        return this.athletes;
    }

    public void setAthletes(ArrayList<Athlete> athletes) {
        this.athletes = athletes;
    }

    public void hireAthlete(Athlete athlete){
        this.athletes.add(athlete);
        System.out.println("Athlete hired!");
    }

    @Override
    public String toString() {
        return "Team ->" +
                "\n\tid: " + this.id +
                "\n\tname: " + this.name +
                "\n\tcoach: " + this.coach +
                "\n\tathletes: " + this.athletes;
    }
}

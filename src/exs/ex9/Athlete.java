package exs.ex9;

public class Athlete {
    private int id;
    private String name;
    private String position;

    public Athlete(int id, String name, String position) {
        this.id = id;
        this.name = name;
        this.position = position;
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

    public String getPosition() {
        return this.position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "\nAthlete ->" +
                "\n\tid: " + this.id +
                "\n\tname: " + this.name +
                "\n\tposition: " + this.position;
    }
}

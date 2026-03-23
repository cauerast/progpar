package exs.ex14;

public class Movie {
    private int id;
    private String title;
    private String gender;
    private int duration;

    public Movie(int id, String title, String gender, int duration) {
        this.id = id;
        this.title = title;
        this.gender = gender;
        this.duration = duration;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGender() {
        return this.gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getDuration() {
        return this.duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "\nMovie ->" +
                "\n\tid: " + this.id +
                "\n\ttitle: " + this.title + '\'' +
                "\n\tgender: " + this.gender + '\'' +
                "\n\tduration: " + this.duration;
    }
}

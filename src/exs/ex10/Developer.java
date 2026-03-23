package exs.ex10;

public class Developer {
    private int id;
    private String name;
    private String bestLanguage;

    public Developer(int id, String name, String bestLanguage) {
        this.id = id;
        this.name = name;
        this.bestLanguage = bestLanguage;
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

    public String getBestLanguage() {
        return this.bestLanguage;
    }

    public void setBestLanguage(String bestLanguage) {
        this.bestLanguage = bestLanguage;
    }

    @Override
    public String toString() {
        return "\nDeveloper ->" +
                "\n\tid: " + this.id +
                "\n\tname: " + this.name +
                "\n\tbestLanguage: " + this.bestLanguage;
    }
}

package exs.ex7;

public class Doctor {
    private int id;
    private String name;
    private String speciality;

    public Doctor(int id, String name, String speciality) {
        this.id = id;
        this.name = name;
        this.speciality = speciality;
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

    public String getSpeciality() {
        return this.speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    @Override
    public String toString() {
        return "\nDoctor ->" +
                "\n\tid: " + this.id +
                "\n\tname: " + this.name +
                "\n\tspeciality: " + this.speciality;
    }
}

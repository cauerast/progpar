package Lecture5;

public class Developer {
    protected String name, language;
    protected float salary;

    public Developer(){}

    public Developer(String name, String language, float salary) {
        this.name = name;
        this.language = language;
        this.salary = salary;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLanguage() {
        return this.language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public float getSalary() {
        return this.salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "\nDeveloper ->" +
                "\n\tname: " + this.name + '\'' +
                "\n\tlanguage: " + this.language + '\'' +
                "\n\tsalary: " + this.salary;
    }
}

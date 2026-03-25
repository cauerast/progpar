package Lecture5;

public class Analyst extends Developer{
    private int projectAmount;

    public Analyst(){
        super();
    }
    public Analyst(String name, String language, float salary, int projectAmount) {
        super(name, language, salary);
        this.projectAmount = projectAmount;
    }
}

package exs.ex16;

public class Analyst extends Developer {
    private int projectAmount;

    public Analyst(){
        super();
    }
    public Analyst(String name, String language, float salary, int projectAmount) {
        super(name, language, salary);
        this.projectAmount = projectAmount;
    }

    public int getProjectAmount() {
        return projectAmount;
    }

    public void setProjectAmount(int projectAmount) {
        this.projectAmount = projectAmount;
    }

    @Override
    public void code(){
        System.out.println("Analyst coding and doing code review");
    }

    @Override
    public float calculateBonus(){
        return super.calculateBonus() + this.salary * 0.10f;
    }
    @Override
    public String toString(){
        return super.toString() +
                "CommitedProjectsAmount: " + this.projectAmount;
    }
}

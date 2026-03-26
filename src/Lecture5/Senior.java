package Lecture5;

public class Senior extends Developer{
    private float leaderAmount;

    public Senior(){
        super();
    }
    public Senior(String name, String language, float salary, float leaderAmount) {
        super(name, language, salary);
        this.leaderAmount = leaderAmount;
    }

    public float getLeaderAmount() {
        return leaderAmount;
    }

    public void setLeaderAmount(float leaderAmount) {
        this.leaderAmount = leaderAmount;
    }
    @Override
    public void code(){
        System.out.println("Senior defines the software architecture and leader other devs");
    }

    @Override
    public float calculateBonus(){
        return super.calculateBonus() + this.salary * 0.30f;
    }

    @Override
    public String toString(){
        return super.toString() +
                "\n\tleaderAmount: " + this.leaderAmount;
    }

}

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

}

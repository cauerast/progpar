package Lecture5;

public class Junior extends Developer{
    private String mentor;

    public Junior(){
        super(); // calls the constructor class (Developer);
    }
    public Junior(String name, String language, float salary, String mentor) {
        super(name, language, salary);
        this.mentor = mentor;
    }
}

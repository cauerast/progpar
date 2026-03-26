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

    public String getMentor() {
        return mentor;
    }

    public void setMentor(String mentor) {
        this.mentor = mentor;
    }

    @Override
    public void code(){
        System.out.println("Junior code w/ your coach: " + this.mentor);
    }

    @Override
    public String toString() {
        return "\njunior ->\n\t" +
                super.toString() +
                "\n\tmentor: " + this.mentor;
    }
}

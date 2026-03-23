package exs.ex9;

public class testTeam {
    public static void main(String[] args){
        Athlete a1 = new Athlete(1, "kobe", "point-guarder");
        Team t1 = new Team(434, "LA Lakers", "abs");

        t1.hireAthlete(a1);
        System.out.println(t1);

        // independent
        System.out.println("\niii::: independent :::iii" + a1);
    }
}

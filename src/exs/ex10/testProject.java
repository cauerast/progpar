package exs.ex10;

public class testProject {
    public static void main(String[] args){

        Developer d1 = new Developer(1, "Dani", "Java");
        Developer d2 = new Developer(2, "Caue", "ts");
        Developer d3 = new Developer(3, "Igor", "js");
        Project p1 = new Project(1, "IA to Uni-FACEF");

        p1.addProjectDevs(d1);
        p1.addProjectDevs(d2);
        p1.addProjectDevs(d3);
        System.out.println(p1);

        p1.showProjectDevs();
    }
}

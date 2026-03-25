package Lecture5;

public class testDeveloper {
    public static void main(String[] args){
        Junior j1 = new Junior("junin", "java", 4000, "seninha");
        Analyst a1 = new Analyst("pleninho", "java", 4000, 5);
        Senior s1 = new Senior("seninha", "java", 9000, 3000);

        System.out.println(j1);
        System.out.println(a1);
        System.out.println(s1);
    }
}

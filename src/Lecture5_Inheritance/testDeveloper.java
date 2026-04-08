package Lecture5_Inheritance;

public class testDeveloper {

    public static void show(Developer dev){
        dev.code();
        System.out.println(dev);
        System.out.println(dev.calculateBonus());

    }
    public static void main(String[] args){
        Junior j1 = new Junior("junin", "java", 4000, "seninha");
        Analyst a1 = new Analyst("pleninho", "java", 4000, 5);
        Senior s1 = new Senior("seninha", "java", 9000, 3000);

        show(j1);
        show(a1);
        show(s1);
    }
}

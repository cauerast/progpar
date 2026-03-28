package exs.ex16;

import java.util.ArrayList;

public class testDeveloper {

    public static void show(Developer dev){
        dev.code();
        System.out.println(dev.calculateBonus());
        System.out.println(dev.toString());

    }
    public static void main(String[] args){
        Junior j1 = new Junior("junin", "java", 4000, "seninha");
        Analyst a1 = new Analyst("pleninho", "java", 4000, 5);
        Senior s1 = new Senior("seninha", "java", 9000, 3000);
        Developer d1 = new Developer("dani", "JAVA", 999999);

        ArrayList<Developer> devs = new ArrayList<>();
        devs.add(j1);
        devs.add(a1);
        devs.add(s1);
        devs.add(d1);

        for(Developer dev: devs){
            show(dev);
        }
    }
}

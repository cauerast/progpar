package exs.ex11;

public class testComputer {
    public static void main(String[] args){
        // composition - cpu depends on the computer
        Computer c1 = new Computer(101, "allienware", new CPU("intel", "i9 14900f", 3.9f));

        System.out.println(c1);
    }
}

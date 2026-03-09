package exs.ex4;

public class TestaArCondicionado {
    public static void main(String[] args){
        ArCondicionado air = new ArCondicionado("Phillips", "AirTuner", 21, true);
        System.out.println(air.getLabel());
        System.out.println(air.getModel());
        System.out.println(air.getTemperature());

        System.out.println(air.toString());

        air.turboMode();
        System.out.println(air.toString());
    }
}

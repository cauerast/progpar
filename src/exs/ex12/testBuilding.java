package exs.ex12;

public class testBuilding {
    public static void main(String[] args) {
        Building b1 = new Building("skyinghigh", "r. poulpitone 239-90");
        b1.buildApartment(2, 3);
        b1.buildApartment(4, 3);
        b1.buildApartment(6, 3);

        System.out.println(b1.toString());
    }
}

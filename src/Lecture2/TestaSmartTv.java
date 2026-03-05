package Lecture2;

public class TestaSmartTv {
    public static void main(String[] args){

        SmartTv s1 = new SmartTv();
        // s1.volume = 30; -> error, volume is a private statement
        s1.setVolume(-140); // impossible
        s1.setVolume(130); // impossible
        s1.setVolume(50); // possible

        System.out.println("Volume: " + s1.getVolume());

        SmartTv s2 = new SmartTv("Samsung", "QLed 45p", 0);
        s2.setConnected(true);
        System.out.println(s2.isConnected());
        s2.openYoutube();
        s2.increaseVolume(40);
        s2.increaseVolume(40);
        s2.increaseVolume(40);

    }
}

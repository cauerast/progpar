package exs.ex5;

public class TestDrone {
    public static void main(String[] args){
        Drone drone = new Drone("code", 0f, 100, true);

        System.out.println(drone.isFlying());
        drone.up(100000000);
        drone.up(100);
        drone.down(3);
        System.out.println(drone.toString());
    }
}

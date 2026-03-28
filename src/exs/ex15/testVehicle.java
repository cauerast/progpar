package exs.ex15;

import java.lang.classfile.attribute.StackMapFrameInfo;

public class testVehicle {
    public static void show(Vehicle vehicle){
        vehicle.fuel();
        vehicle.move();
        System.out.println(vehicle.toString());
    }

    public static void main(String[] args){

        Plane plane = new Plane("Qatar", "boing", 2000, 5000);
        ElectricCar ec = new ElectricCar("BYD", "dolphin", 150, 30000);

        show(plane);
        show(ec);
    }
}

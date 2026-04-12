package exs.ex18;

import java.util.Objects;

public class ElectronicLock implements Auth, Device{

    private String pass;

    public ElectronicLock(){};
    public ElectronicLock(String pass){
        this.pass = pass;
    };

    public String getPass() {
        return this.pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    @Override
    public void authenticate(String pass) {
        if(Objects.equals(pass, "123")){
            on();
        } else {
            off();
        }
    }

    @Override
    public void on() {
        System.out.println("Door opened!");
    }

    @Override
    public void off() {
        System.out.println("Door locked");
    }

}

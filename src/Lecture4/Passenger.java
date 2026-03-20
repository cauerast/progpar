package Lecture4;

public class Passenger {
    private String name, cpf;

    public Passenger(){}
    public Passenger(String name, String cpf) {
        this.name = name;
        this.cpf = cpf;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "\nPassanger ->" +
                "\n\tname: " + this.name +
                "\n\tcpf: " + this.cpf;
    }
}

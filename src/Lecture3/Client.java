package Lecture3;

public class Client {
    private int id;
    private String name, cpf, address;

    public Client(){}
    public Client(int id, String name, String cpf, String address) {
        this.id = id;
        this.name = name;
        this.cpf = cpf;
        this.address = address;
    }

    private void setId(int id) {
        this.id = id;
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setCpf(String cpf) {
        this.cpf = cpf;
    }

    private void setAddress(String address) {
        this.address = address;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getCpf() {
        return this.cpf;
    }

    public String getAddress() {
        return this.address;
    }

    @Override
    public String toString() {
        return "\n\tClient{" +
                "\n\tid: " + this.id +
                "\n\tname: " + this.name +
                "\n\tcpf: " +  this.cpf +
                "\n\taddress: " + this.address +
                '}';
    }
}

package exs.ex7;

public class Patient {
    private int id;
    private String name;
    private String cpf;

    public Patient(int id, String name, String cpf) {
        this.id = id;
        this.name = name;
        this.cpf = cpf;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
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
        return "\nPatient ->" +
                "\n\tid: " + this.id +
                "\n\tname: " + this.name +
                "\n\tcpf: " + this.cpf;
    }
}

package exs.ex6;

public class Student {
    private int id;
    private String name;
    private int register;
    private String major;

    public Student(){}
    //  nao precisava de getters and setters aqui, pois nao temos ifs e elses nos sets,
    //  ou seja, nao temos restricoes para colocar set e get.
    public Student(int id, String name, int register, String major) {
        setId(id);
        setName(name);
        setRegister(register);
        setMajor(major);
    }

    public int getId() {
        return this.id;
    }

    private void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public int getRegister() {
        return this.register;
    }

    private void setRegister(int register) {
        this.register = register;
    }

    public String getMajor() {
        return this.major;
    }

    private void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String toString() {
        return "\nStudent -> " +
                "\n\tid: " + id +
                "\n\tname: " + name +
                "\n\tregister: " + register +
                "\n\tmajor: " + major;
    }
}

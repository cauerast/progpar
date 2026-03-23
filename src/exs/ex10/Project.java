package exs.ex10;

import java.util.ArrayList;
import java.util.Date;

public class Project {
    private int id;
    private String projName;
    private ArrayList<Developer> developers;

    public Project(int id, String projName) {
        this.id = id;
        this.projName = projName;
        this.developers = new ArrayList<>();
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProjName() {
        return this.projName;
    }

    public void setProjName(String projName) {
        this.projName = projName;
    }

    public ArrayList<Developer> getDevelopers() {
        return this.developers;
    }

    public void setDevelopers(ArrayList<Developer> developers) {
        this.developers = developers;
    }

    public void addProjectDevs(Developer dev){
        this.developers.add(dev);
        System.out.println("dev added to project");
    }
    public void showProjectDevs(){
        for(Developer dev: developers){
            System.out.println(dev.getName());
        }
    }

    @Override
    public String toString() {
        return "\nProject ->" +
                "\n\tid: " + this.id +
                "\n\tprojName: " + this.projName +
                "\n\tdevelopers: " + this.developers;
    }
}

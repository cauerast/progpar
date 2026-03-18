package exs.ex6;

import java.util.ArrayList;

public class Test {
    private int id;
    private String name;
    private ArrayList<Question> questions;

    public Test(){
        this.questions = new ArrayList<>();
    }
    public Test(int id, String name) {
        setId(id);
        setName(name);
        this.questions = new ArrayList<>();
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

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Question> getQuestions() {
        return this.questions;
    }

    public void setQuestions(ArrayList<Question> questions) {
        this.questions = questions;
    }

    // composition - create the obj
    public void addQuestion(int num, String stat, float val){
        Question newQuestion = new Question(num, stat, val);
        this.questions.add(newQuestion);
        System.out.println("Question has been added!");
    }

    @Override
    public String toString() {
        return "\nTest -> " +
                "\n\tid: " + id +
                "\n\tname: " + name +
                "\n\tquestions: " + questions;
    }
}

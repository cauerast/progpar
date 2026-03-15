package exs.ex6;

import java.util.ArrayList;

public class Discipline {
    private int id;
    private String name;
    private String teacher;
    private ArrayList<Student> students;
    private ArrayList<Test> tests;

    public Discipline(){
        this.students = new ArrayList<Student>();
        this.tests = new ArrayList<>();
    }
    public Discipline(int id, String name, String teacher){
        setId(id);
        setName(name);
        setTeacher(teacher);
        this.students = new ArrayList<Student>();
        this.tests = new ArrayList<>();
    }

    public void enrollStudent(Student student){
        // don't need to create a student, that already exists, just pass by parameter
        students.add(student);
        System.out.println("student enrolled!");
    }

    public void createTest(int id, String name){
        // create test, because it not already exists
        Test test = new Test(id, name);
        tests.add(test);
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

    public String getTeacher() {
        return this.teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public ArrayList<Student> getStudents() {
        return this.students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public ArrayList<Test> getTests() {
        return this.tests;
    }

    public void setTests(ArrayList<Test> tests) {
        this.tests = tests;
    }
}
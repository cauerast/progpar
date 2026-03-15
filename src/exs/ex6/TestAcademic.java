package exs.ex6;

public class TestAcademic {
    public static void main(String[] args){

        Student std1 = new Student(1, "Gabriel", 26001, "Biomedicine");
        Student std2 = new Student(2, "Caue", 26002, "Computer Science");

        Discipline dsp1 = new Discipline(123, "Bio Chemistry", "Dr. Crespie");
        Discipline dsp2 = new Discipline(142, "OOP", "Daniel <3");

        dsp2.enrollStudent(std1); // aggregation ( use the created obj )
        dsp2.enrollStudent(std2); // aggregation ( use the created obj )
        dsp2.createTest(1864, "Semester Test"); // composition ( create the obj )

        dsp2.getTests().get(0).addQuestion(1, "q1", 3.33f);
        dsp2.getTests().get(0).addQuestion(1, "q2", 3.33f);
        dsp2.getTests().get(0).addQuestion(1, "q3", 3.33f);

        System.out.println(dsp2);

    }
}


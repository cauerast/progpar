package exs.ex6;

public class Question {
    private int number;
    private String statement;
    private float value;

    public Question(){}
    public Question(int number, String statement, float value) {
        setNumber(number);
        setStatement(statement);
        setValue(value);
    }

    public int getNumber() {
        return this.number;
    }

    private void setNumber(int number) {
        this.number = number;
    }

    public String getStatement() {
        return this.statement;
    }

    private void setStatement(String statement) {
        this.statement = statement;
    }

    public float getValue() {
        return this.value;
    }

    private void setValue(float value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Question{" +
                "number=" + number +
                ", statement='" + statement + '\'' +
                ", value=" + value +
                '}';
    }
}

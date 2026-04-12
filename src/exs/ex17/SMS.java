package exs.ex17;

public class SMS extends NotificationChannel{

    private String cellNumber;

    public SMS() {
        super();
    }
    public SMS(String destiny, String message, String cellNumber) {
        super(destiny, message);
        this.cellNumber = cellNumber;
    }

    public String getCellNumber() {
        return this.cellNumber;
    }

    public void setCellNumber(String cellNumber) {
        this.cellNumber = cellNumber;
    }

    @Override
    public void send() {
        System.out.println("Sending SMS to number: " + this.cellNumber +
                "\nmessage: " + this.message);
    }

    @Override
    public String toString(){
        return "SMS: \n\t" +
                super.toString() +
                "\n\tCellNumber: " + this.cellNumber;
    }
}


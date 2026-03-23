package exs.ex8;

import java.time.LocalDateTime;

public class Loan {
    private LocalDateTime loanDate;
    private LocalDateTime returnDate;
    private Reader reader;
    private Book book;

    public Loan(Book book, Reader reader, LocalDateTime loanDate, LocalDateTime returnDate) {
        this.book = book;
        this.reader = reader;
        this.loanDate = loanDate;
        this.returnDate = returnDate;
    }

    public LocalDateTime getLoanDate() {
        return this.loanDate;
    }

    public void setLoanDate(LocalDateTime loanDate) {
        this.loanDate = loanDate;
    }

    public LocalDateTime getReturnDate() {
        return this.returnDate;
    }

    public void setReturnDate(LocalDateTime returnDate) {
        this.returnDate = returnDate;
    }

    public Reader getReader() {
        return this.reader;
    }

    public void setReader(Reader reader) {
        this.reader = reader;
    }

    public Book getBook() {
        return this.book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    @Override
    public String toString() {
        return "\nLoan ->" +
                "\n\tloanDate: " + this.loanDate +
                "\n\treturnDate: " + this.returnDate +
                "\n\treader: " + this.reader +
                "\n\tbook: " + this.book;
    }
}

package exs.ex8;

import java.time.LocalDateTime;

public class testLoan {
    public static void main(String[] args){
        Reader r1 = new Reader(1, "SpongeBob");
        Book b1 = new Book(334, "how to Hunt Jellyfishes", "Ms. jellyfish");

        LocalDateTime loanDate = LocalDateTime.now();
        LocalDateTime returnDate = LocalDateTime.now().plusDays(30);
        Loan l1 = new Loan(b1, r1, loanDate, returnDate);

        System.out.println(l1);
    }
}

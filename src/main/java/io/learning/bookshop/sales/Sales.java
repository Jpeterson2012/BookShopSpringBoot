package io.learning.bookshop.sales;

import io.learning.bookshop.books.Books;
import io.learning.bookshop.members.Members;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Objects;

@Entity
public final class Sales {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int invoice_id;
    private int book_id;
    private int member_id;
    private int qty;
    private long amount;
    private LocalDate date_s;

    @ManyToOne
    @JoinColumn(name="book_id",insertable = false,updatable = false)
    Books books2;

    @ManyToOne
    @JoinColumn(name="member_id",insertable = false,updatable = false)
    Members members2;

    public Sales() {}

    public Sales(int qty, long amount, LocalDate date_s, Books books2, Members members2) {
        this.book_id = books2.getId();
        this.member_id = members2.getId();
        this.qty = qty;
        this.amount = amount;
        this.date_s = date_s;
        this.books2 = books2;
        this.members2 = members2;
    }

    public int getInvoice_id() {
        return invoice_id;
    }

    public void setInvoice_id(int invoice_id) {
        this.invoice_id = invoice_id;
    }

    public int getBook_id() {
        return book_id;
    }

    public void setBook_id(int book_id) {
        this.book_id = book_id;
    }

    public int getMember_id() {
        return member_id;
    }

    public void setMember_id(int member_id) {
        this.member_id = member_id;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    public LocalDate getDate_s() {
        return date_s;
    }

    public void setDate_s(LocalDate date_s) {
        this.date_s = date_s;
    }

    public Books getBooks2() {
        return books2;
    }

    public void setBooks2(Books books2) {
        this.books2 = books2;
    }

    public Members getMembers2() {
        return members2;
    }

    public void setMembers2(Members members2) {
        this.members2 = members2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sales sales = (Sales) o;
        return invoice_id == sales.invoice_id && book_id == sales.book_id && member_id == sales.member_id && qty ==
                sales.qty && amount == sales.amount && Objects.equals(date_s, sales.date_s) &&
                Objects.equals(books2, sales.books2) && Objects.equals(members2, sales.members2);
    }

    @Override
    public int hashCode() {
        return Objects.hash(invoice_id, book_id, member_id, qty, amount, date_s, books2, members2);
    }
}

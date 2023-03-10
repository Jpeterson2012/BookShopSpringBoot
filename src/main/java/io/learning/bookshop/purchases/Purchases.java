package io.learning.bookshop.purchases;

import io.learning.bookshop.books.Books;
import io.learning.bookshop.members.Members;
import jakarta.persistence.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDate;
import java.util.Objects;

@Entity
public final class Purchases {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ord_id;
    private int book_id;
    private int mem_id;
    private int qty;
    private LocalDate dt_ordered;
    private LocalDate eta;
    private char received;
    private int inv;

    @ManyToOne
    @JoinColumn(name="book_id",insertable = false,updatable = false)
    private Books books;

    @ManyToOne
    @JoinColumn(name="mem_id",insertable = false,updatable = false)
    private Members members;


    public Purchases() {};
    public Purchases(int qty, LocalDate dt_ordered, LocalDate eta, char received, int inv, Books books, Members members) {
        this.book_id = books.getId();
        this.mem_id = members.getId();
        this.qty = qty;
        this.dt_ordered = dt_ordered;
        this.eta = eta;
        this.received = received;
        this.inv = inv;
        this.books = books;
        this.members = members;

    }

    public int getOrd_id() {
        return ord_id;
    }

    public void setOrd_id(int ord_id) {
        this.ord_id = ord_id;
    }

    public int getBook_id() {
        return book_id;
    }

    public void setBook_id(int book_id) {
        this.book_id = book_id;
    }

    public int getMem_id() {
        return mem_id;
    }

    public void setMem_id(int mem_id) {
        this.mem_id = mem_id;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public LocalDate getDt_ordered() {
        return dt_ordered;
    }

    public void setDt_ordered(LocalDate dt_ordered) {
        this.dt_ordered = dt_ordered;
    }

    public LocalDate getEta() {
        return eta;
    }

    public void setEta(LocalDate eta) {
        this.eta = eta;
    }

    public char getReceived() {
        return received;
    }

    public void setReceived(char received) {
        this.received = received;
    }

    public int getInv() {
        return inv;
    }

    public void setInv(int inv) {
        this.inv = inv;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Purchases purchases = (Purchases) o;
        return ord_id == purchases.ord_id && book_id == purchases.book_id && mem_id == purchases.mem_id && qty ==
                purchases.qty && received == purchases.received && inv == purchases.inv && Objects.equals(dt_ordered, purchases.dt_ordered) &&
                Objects.equals(eta, purchases.eta) && Objects.equals(books, purchases.books) && Objects.equals(members, purchases.members);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ord_id, book_id, mem_id, qty, dt_ordered, eta, received, inv, books, members);
    }
}

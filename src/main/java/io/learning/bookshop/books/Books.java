package io.learning.bookshop.books;

import io.learning.bookshop.purchases.Purchases;
import io.learning.bookshop.sales.Sales;
import jakarta.persistence.*;

import java.util.Objects;
import java.util.Set;

@Entity
public final class Books {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String auth;
    private String price;
    private String qty;

    @OneToMany(mappedBy = "books", cascade = CascadeType.ALL)
    private Set<Purchases> purchases;

    @OneToMany(mappedBy = "books2",cascade = CascadeType.ALL)
    private Set<Sales> sales;

    public Books() {}
    public Books(String name, String auth, String price, String qty) {
        this.name = name;
        this.auth = auth;
        this.price = price;
        this.qty = qty;
    }

    public int getId() {return id;}
    public String getName() {return name;}
    public String getAuth() {return auth;}
    public String getPrice() {return price;}
    public String getQty() {return qty;}

    public void setId(int id) {this.id = id;}
    public void setName(String name) {this.name = name;}
    public void setAuth(String auth) {this.auth = auth;}
    public void setPrice(String price) {this.price = price;}
    public void setQty(String qty) {this.qty = qty;}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Books books = (Books) o;
        return id == books.id && Objects.equals(name, books.name) && Objects.equals(auth, books.auth) && Objects.equals(price, books.price) && Objects.equals(qty, books.qty);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, auth, price, qty);
    }
}

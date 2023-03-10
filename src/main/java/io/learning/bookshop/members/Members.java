package io.learning.bookshop.members;

import io.learning.bookshop.purchases.Purchases;
import io.learning.bookshop.sales.Sales;
import jakarta.persistence.*;

import java.util.Objects;
import java.util.Set;

@Entity
public final class Members {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String addr_line1;
    private String addr_line2;
    private String addr_city;
    private String addr_state;
    private String phn;

    @OneToMany(mappedBy = "members", cascade = CascadeType.ALL)
    private Set<Purchases> purchases;

    @OneToMany(mappedBy = "members2",cascade = CascadeType.ALL)
    private Set<Sales> sales;

    public Members() {}
    public Members( String name, String addr_line1, String addr_line2, String addr_city, String addr_state, String phn) {
        //this.id = id;
        this.name = name;
        this.addr_line1 = addr_line1;
        this.addr_line2 = addr_line2;
        this.addr_city = addr_city;
        this.addr_state = addr_state;
        this.phn = phn;
    }

    public int getId() {return id;}
    public void setId(int id) {this.id = id;}

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    public String getAddr_line1() {return addr_line1;}
    public void setAddr_line1(String addr_line1) {this.addr_line1 = addr_line1;}

    public String getAddr_line2() {return addr_line2;}
    public void setAddr_line2(String addr_line2) {this.addr_line2 = addr_line2;}

    public String getAddr_city() {return addr_city;}
    public void setAddr_city(String addr_city) {this.addr_city = addr_city;}

    public String getAddr_state() {return addr_state;}
    public void setAddr_state(String addr_state) {this.addr_state = addr_state;}

    public String getPhn() {return phn;}
    public void setPhn(String phn) {this.phn = phn;}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Members members = (Members) o;
        return id == members.id && Objects.equals(name, members.name) && Objects.equals(addr_line1, members.addr_line1) && Objects.equals(addr_line2, members.addr_line2) && Objects.equals(addr_city, members.addr_city) && Objects.equals(addr_state, members.addr_state) && Objects.equals(phn, members.phn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, addr_line1, addr_line2, addr_city, addr_state, phn);
    }
}

package io.learning.bookshop.suppliers;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Objects;

@Entity
public class Suppliers {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String phn;
    private String addrLine1;
    private String addrLine2;
    private String addrCity;
    private String addrState;

    public Suppliers() {}
    public Suppliers(String name, String phn, String addrLine1, String addrLine2, String addrCity, String addrState) {
        this.name = name;
        this.phn = phn;
        this.addrLine1 = addrLine1;
        this.addrLine2 = addrLine2;
        this.addrCity = addrCity;
        this.addrState = addrState;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhn() {
        return phn;
    }

    public void setPhn(String phn) {
        this.phn = phn;
    }

    public String getAddrLine1() {
        return addrLine1;
    }

    public void setAddrLine1(String addrLine1) {
        this.addrLine1 = addrLine1;
    }

    public String getAddrLine2() {
        return addrLine2;
    }

    public void setAddrLine2(String addrLine2) {
        this.addrLine2 = addrLine2;
    }

    public String getAddrCity() {
        return addrCity;
    }

    public void setAddrCity(String addrCity) {
        this.addrCity = addrCity;
    }

    public String getAddrState() {
        return addrState;
    }

    public void setAddrState(String addrState) {
        this.addrState = addrState;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Suppliers suppliers = (Suppliers) o;
        return id == suppliers.id && Objects.equals(name, suppliers.name) && Objects.equals(phn, suppliers.phn) &&
                Objects.equals(addrLine1, suppliers.addrLine1) && Objects.equals(addrLine2, suppliers.addrLine2) &&
                Objects.equals(addrCity, suppliers.addrCity) && Objects.equals(addrState, suppliers.addrState);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, phn, addrLine1, addrLine2, addrCity, addrState);
    }
}

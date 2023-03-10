package io.learning.bookshop.employees;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Objects;

@Entity
public final class Employees {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String addr_line1;
    private String addr_line2;
    private String addr_city;
    private String addr_state;
    private String phn;
    private String salary;
    private String mgr_status;

    public Employees() {}
    public Employees(String name, String addrLine1, String addrLine2, String addrCity, String addrState, String phn, String salary, String mStatus) {
        this.name = name;
        this.addr_line1 = addrLine1;
        this.addr_line2 = addrLine2;
        this.addr_city = addrCity;
        this.addr_state = addrState;
        this.phn = phn;
        this.salary = salary;
        this.mgr_status = mStatus;
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

    public String getSalary() {return salary;}
    public void setSalary(String salary) {this.salary = salary;}

    public String getMgr_status() {return mgr_status;}
    public void setMgr_status(String mgr_status) {this.mgr_status = mgr_status;}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employees employees = (Employees) o;
        return id == employees.id && Objects.equals(name, employees.name) && Objects.equals(addr_line1, employees.addr_line1) && Objects.equals(addr_line2, employees.addr_line2) && Objects.equals(addr_city, employees.addr_city) && Objects.equals(addr_state, employees.addr_state) && Objects.equals(phn, employees.phn) && Objects.equals(salary, employees.salary) && Objects.equals(mgr_status, employees.mgr_status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, addr_line1, addr_line2, addr_city, addr_state, phn, salary, mgr_status);
    }
}

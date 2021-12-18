/*Auther : Manoj Sakat*/

package com.gamma.SmallBaazaar.model;



import javax.persistence.*;

//Author: Ajinkya
@Entity(name = "customer")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "custid")
    int custid;

    @Column(name = "custname")
    String custname;

    @Column(name = "custcity")
    String custcity;

    @Column(name = "email")
    String email;

    @Column(name = "password")
    String password;

    public Customer(){}


    public Customer(String custname, String custcity, String email, String password) {
        this.custname = custname;
        this.custcity = custcity;
        this.email = email;
        this.password = password;
    }

    public int getCustid() {
        return custid;
    }

    public void setCustid(int custid) {
        this.custid = custid;
    }

    public String getCustname() {
        return custname;
    }

    public void setCustname(String custname) {
        this.custname = custname;
    }

    public String getCustcity() {
        return custcity;
    }

    public void setCustcity(String custcity) {
        this.custcity = custcity;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

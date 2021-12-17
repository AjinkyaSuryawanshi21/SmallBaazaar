package com.gamma.SmallBaazaar.model;

import javax.persistence.*;

@Entity(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "fpid")
    int fpid;

    @Column(name = "fpname")
    String fpname;

    public Product(){}

    public Product(int fpid, String fpname) {
        this.fpid = fpid;
        this.fpname = fpname;
    }

    public int getFpid() {
        return fpid;
    }

    public void setFpid(int fpid) {
        this.fpid = fpid;
    }

    public String getFpname() {
        return fpname;
    }

    public void setFpname(String fpname) {
        this.fpname = fpname;
    }
}

package com.gamma.SmallBaazaar.model;

import javax.persistence.*;

//Author: Ajinkya, Akshay and Manoj
@Entity(name = "product_supplier")
public class ProductSupplier {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "psid")
    int psid;

    @Column(name = "fpid")
    int fpid;

    @Column(name = "sid")
    int sid;

    @Column(name = "price")
    double price;

    @Column(name = "grade")
    int grade;

    @Column(name = "count")
    int count;

    @Column(name = "final_grade")
    double final_grade;

    public ProductSupplier(){}

    public ProductSupplier(int psid, int fpid, int sid, double price, int grade, int count, double final_grade) {
        this.psid = psid;
        this.fpid = fpid;
        this.sid = sid;
        this.price = price;
        this.grade = grade;
        this.count = count;
        this.final_grade = final_grade;
    }

    public int getPsid() {
        return psid;
    }

    public void setPsid(int psid) {
        this.psid = psid;
    }

    public int getFpid() {
        return fpid;
    }

    public void setFpid(int fpid) {
        this.fpid = fpid;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getFinal_grade() {
        return final_grade;
    }

    public void setFinal_grade(double final_grade) {
        this.final_grade = final_grade;
    }
}

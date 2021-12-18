package com.gamma.SmallBaazaar.model;


import javax.persistence.*;

//Author: Akshay
@Entity(name = "supplier")
public class Supplier {

    @Id
    @Column(name = "sid")
    int sid;

    @Column(name = "sname")
    String sname;

    @Column(name = "grade")
    int grade;

    @Column(name = "count")
    int count;

    @Column(name = "final_grade")
    double final_grade;

    @Column(name = "password")
    String password;

    public Supplier(){}

    public Supplier(int sid, String sname, int grade, int count, double final_grade, String password) {
        this.sname = sname;
        this.grade = grade;
        this.count = count;
        this.final_grade = final_grade;
        this.password = password;
        this.sid = sid;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

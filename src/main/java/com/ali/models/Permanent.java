package com.ali.models;

import javax.persistence.Entity;

@Entity
public class Permanent extends Instructor{
    private Double fixedSalary;

    public Permanent(String name, String address, String phoneNumber,Double fixedSalary) {
        super(name, address, phoneNumber);
        this.fixedSalary=fixedSalary;
    }

    public Permanent() {

    }

    public Double getFixedSalary() {
        return fixedSalary;
    }

    public void setFixedSalary(Double fixedSalary) {
        this.fixedSalary = fixedSalary;
    }
}

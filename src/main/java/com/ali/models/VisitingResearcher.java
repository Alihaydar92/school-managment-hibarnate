package com.ali.models;

import javax.persistence.Entity;

@Entity
public class VisitingResearcher extends Instructor {
    private Double hourlySalary;

    public Double getHourlySalary() {
        return hourlySalary;
    }

    public void setHourlySalary(Double hourlySalary) {
        this.hourlySalary = hourlySalary;
    }

    public VisitingResearcher(){

    }

    public VisitingResearcher(String name, String address, String phoneNumber, Double hourlySalary) {
        super(name, address, phoneNumber);
        this.hourlySalary = hourlySalary;
    }
}

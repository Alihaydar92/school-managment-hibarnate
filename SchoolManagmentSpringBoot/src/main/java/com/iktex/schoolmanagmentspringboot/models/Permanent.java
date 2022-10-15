package com.iktex.schoolmanagmentspringboot.models;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Permanent extends Instructor{
    private Double fixedSalary;

    public Permanent(String name, String address, String phoneNumber,Double fixedSalary) {
        super(name, address, phoneNumber);
        this.fixedSalary=fixedSalary;
    }
}

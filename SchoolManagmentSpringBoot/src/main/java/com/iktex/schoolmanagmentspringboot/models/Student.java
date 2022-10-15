package com.iktex.schoolmanagmentspringboot.models;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Temporal(TemporalType.DATE)
    private Date birthDate;
    private String address;
    @Enumerated(EnumType.ORDINAL)
    private Gender gender;
    @ManyToOne
    private StudentCourse studentCourse;
    public Student(String name, Date birthDate, String address, Gender gender) {
        this.name = name;
        this.birthDate = birthDate;
        this.address = address;
        this.gender = gender;
    }



}

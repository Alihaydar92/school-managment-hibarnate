package com.iktex.schoolmanagmentspringboot.models;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String courseName;
    private int courseCode;
    private Double creditScore;
    @ManyToOne
    private Instructor instructor;
    @ManyToOne
    private StudentCourse studentCourse;
    public Course(String courseName, int courseCode, Double creditScore) {

        this.courseName = courseName;
        this.courseCode = courseCode;
        this.creditScore = creditScore;
    }
}

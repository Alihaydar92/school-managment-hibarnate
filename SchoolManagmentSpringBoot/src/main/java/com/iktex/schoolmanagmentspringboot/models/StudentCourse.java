package com.iktex.schoolmanagmentspringboot.models;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class StudentCourse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "studentCourse")
    private List<Student>  studentList=new ArrayList<>();

    @OneToMany(mappedBy = "studentCourse")
    private List<Course> courseList=new ArrayList<>();


}

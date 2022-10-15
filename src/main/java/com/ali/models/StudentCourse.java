package com.ali.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class StudentCourse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "studentCourse")
    private List<Student>  studentList=new ArrayList<>();

    @OneToMany(mappedBy = "studentCourse")
    private List<Course> courseList=new ArrayList<>();

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public List<Course> getCourseList() {
        return courseList;
    }

    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }

    public StudentCourse() {
    }
}

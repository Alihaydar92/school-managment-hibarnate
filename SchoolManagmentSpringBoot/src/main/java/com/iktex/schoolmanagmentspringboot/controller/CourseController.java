package com.iktex.schoolmanagmentspringboot.controller;

import com.iktex.schoolmanagmentspringboot.models.Course;
import com.iktex.schoolmanagmentspringboot.service.CourseService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("/course")
@RequiredArgsConstructor
public class CourseController {

    private final CourseService courseService;


    @GetMapping
    public List<Course> listOfCourse() {
        return courseService.courseList();
    }

    @GetMapping("/{id}")
    public Course courseById(@PathVariable("id") long id) {
        return courseService.courseById(id);
    }

    @PostMapping
    public long insertCourse(@RequestBody Course course) {
        return courseService.saveCourse(course);
    }
}

package com.iktex.schoolmanagmentspringboot.service;

import com.iktex.schoolmanagmentspringboot.models.Course;
import com.iktex.schoolmanagmentspringboot.repository.CourseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CourseService {

    private final CourseRepository courseRepository;

    public List<Course> courseList() {
        return courseRepository.findAll();
    }

    public Course courseById(long id) {
        return courseRepository.findById(id).get();

    }
    public long saveCourse(Course course) {

        return courseRepository.save(course).getId();
    }
}

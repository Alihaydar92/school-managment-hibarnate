package com.iktex.schoolmanagmentspringboot.repository;

import com.iktex.schoolmanagmentspringboot.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course,Long> {
}

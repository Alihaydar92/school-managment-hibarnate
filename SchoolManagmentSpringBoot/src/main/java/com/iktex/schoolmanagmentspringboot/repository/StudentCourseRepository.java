package com.iktex.schoolmanagmentspringboot.repository;

import com.iktex.schoolmanagmentspringboot.models.StudentCourse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentCourseRepository extends JpaRepository<StudentCourse,Long> {
}

package com.iktex.schoolmanagmentspringboot.repository;

import com.iktex.schoolmanagmentspringboot.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {
}

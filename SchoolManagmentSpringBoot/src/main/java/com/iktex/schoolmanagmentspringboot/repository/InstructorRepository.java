package com.iktex.schoolmanagmentspringboot.repository;

import com.iktex.schoolmanagmentspringboot.models.Instructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InstructorRepository extends InstructorBaseRepository<Instructor>{
}

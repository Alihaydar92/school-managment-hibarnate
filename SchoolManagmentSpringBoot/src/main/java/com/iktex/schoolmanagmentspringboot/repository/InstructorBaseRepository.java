package com.iktex.schoolmanagmentspringboot.repository;

import com.iktex.schoolmanagmentspringboot.models.Instructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface InstructorBaseRepository <T extends Instructor> extends JpaRepository<T,Long> {
}

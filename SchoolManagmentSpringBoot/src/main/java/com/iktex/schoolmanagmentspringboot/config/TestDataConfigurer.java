package com.iktex.schoolmanagmentspringboot.config;


import com.iktex.schoolmanagmentspringboot.models.*;
import com.iktex.schoolmanagmentspringboot.repository.*;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import javax.transaction.Transactional;
import java.time.LocalDate;
import java.time.Month;
import java.util.Date;
import java.util.logging.Logger;

@Configuration
@RequiredArgsConstructor
@Slf4j
public class TestDataConfigurer implements CommandLineRunner {

    //private static final Logger logger = Logger.getLogger("TestDataConfigurer");

    //@PersistenceContext
    //EntityManager entityManager;

    private final CourseRepository courseRepository;
    private final InstructorRepository instructorRepository;
    private final PermanentRepository permanentRepository;
    private final VisitingResearcherRepository visitingResearcherRepository;
    private final StudentRepository studentRepository;
    private final StudentCourseRepository studentCourseRepository;

    @Override
    @Transactional
    public void run(String... args) throws Exception {
        // prepare entities ( in transient state)

//        Student student = new Student("Aliheydar", new Date(), "Sahil", Gender.MALE);
//        Student student2 = new Student("Cavid", new Date(), "Lerik", Gender.MALE);
//        Student student3 = new Student("Aygun", new Date(), "Mkr", Gender.FEMALE);
//        Student student4 = new Student("Sevinc", new Date(), "Zire", Gender.FEMALE);
//
//        Instructor instructor = new Permanent("Hoca", "Sahara", "08923382", 109.8);
//        Instructor instructor2 = new VisitingResearcher("Muellim", "Kanyon", "234234234", 30.1);
//
//        Course course = new Course("Hibernate", 123, 99.9);
//        Course course2 = new Course("JPA", 321, 65.4);
//        Course course3 = new Course("Java FX", 456, 56.2);
//        Course course4 = new Course("Winform", 654, 34.1);
//
//        StudentCourse studentCourse = new StudentCourse();
//        StudentCourse studentCourse2 = new StudentCourse();
//        StudentCourse studentCourse3 = new StudentCourse();
//
//        course.setInstructor(instructor2);
//        course2.setInstructor(instructor);
//
////        student.getCourseList().add(course);
////        student2.getCourseList().add(course3);
////        student3.getCourseList().add(course4);
////        student4.getCourseList().add(course2);
//
//        student.setStudentCourse(studentCourse);
//        student2.setStudentCourse(studentCourse2);
////        student3.setStudentCourse(studentCourse3);
//
//        course.setStudentCourse(studentCourse);
////        course2.setStudentCourse(studentCourse2);
//        course3.setStudentCourse(studentCourse3);
//
//        studentRepository.save(student);
//        studentRepository.save(student2);
//        studentRepository.save(student3);
//        studentRepository.save(student4);
//
//        courseRepository.save(course);
//        courseRepository.save(course2);
//        courseRepository.save(course3);
//        courseRepository.save(course4);
//
//        instructorRepository.save(instructor);
//        instructorRepository.save(instructor2);
//
//        studentCourseRepository.save(studentCourse);
//        studentCourseRepository.save(studentCourse2);
//        studentCourseRepository.save(studentCourse3);
//
//
//
//
//        log.info("All data saved....");

    }
}

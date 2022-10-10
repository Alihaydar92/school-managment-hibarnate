package com.ali.clients;

import com.ali.models.*;
import com.ali.utils.EntityManagerUtils;

import javax.persistence.EntityManager;
import java.util.Date;

public class SchoolApiClient {
    public static void main(String[] args) {


        Student student = new Student("Aliheydar", new Date(), "Sahil", Gender.MALE);
        Student student2 = new Student("Cavid", new Date(), "Lerik", Gender.MALE);
        Student student3 = new Student("Aygun", new Date(), "Mkr", Gender.FEMALE);
        Student student4 = new Student("Sevinc", new Date(), "Zire", Gender.FEMALE);

        Instructor instructor = new Permanent("Hoca", "Sahara", "08923382",109.8);
        Instructor instructor2 = new VisitingResearcher("Muellim", "Kanyon", "234234234",30.1);

        Course course = new Course("Hibernate", 123, 99.9);
        Course course2 = new Course("JPA", 321, 65.4);
        Course course3 = new Course("Java FX", 456, 56.2);
        Course course4 = new Course("Winform", 654, 34.1);


        course.setInstructor(instructor2);
        course2.setInstructor(instructor);

        student.getCourseList().add(course);
        student2.getCourseList().add(course3);
        student3.getCourseList().add(course4);
        student4.getCourseList().add(course2);

        EntityManager em = EntityManagerUtils.getEntityManager("mysqlPU");

        em.getTransaction().begin();

        em.persist(student );
        em.persist(student2);
        em.persist(student3);
        em.persist(student4);

        em.persist(course );
        em.persist(course2);
        em.persist(course3);
        em.persist(course4);

        em.persist(instructor );
        em.persist(instructor2);

        em.getTransaction().commit();

        EntityManagerUtils.closeEntityManager(em);
    }
}

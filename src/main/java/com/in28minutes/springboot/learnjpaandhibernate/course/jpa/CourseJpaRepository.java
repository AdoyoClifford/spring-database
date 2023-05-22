package com.in28minutes.springboot.learnjpaandhibernate.course.jpa;


import com.in28minutes.springboot.learnjpaandhibernate.course.Course;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class CourseJpaRepository {

    @PersistenceContext
    EntityManager entityManager;
    public void insertQuery(Course course) {
        entityManager.merge(course);
    }

    public void findById(int id) {

    }
}

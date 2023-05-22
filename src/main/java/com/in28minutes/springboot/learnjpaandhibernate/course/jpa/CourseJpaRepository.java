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

    public Course findById(int id) {
        return entityManager.find(Course.class, id);
    }

    public void deleteId(int id) {
        Course course = entityManager.find(Course.class, id);
        entityManager.remove(course);
    }
}
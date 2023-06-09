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

    public Course selectById(int id) {
        return entityManager.find(Course.class, id);
    }

    public void findById(int id) {
        Course course = entityManager.find(Course.class, id);
        entityManager.remove(course);
    }
}
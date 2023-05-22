package com.in28minutes.springboot.learnjpaandhibernate.course;

import com.in28minutes.springboot.learnjpaandhibernate.course.jdbc.CourseJdbcRepository;
import com.in28minutes.springboot.learnjpaandhibernate.course.jpa.CourseJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

//    @Autowired
//    private CourseJdbcRepository repository;

    @Autowired
    private CourseJpaRepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.insertQuery(new Course(1, "Learn AWS Now", "Adoyo"));
        repository.insertQuery(new Course(2, "Learn Azure Now", "Adoyo"));
        repository.insertQuery(new Course(3, "Learn DevOps Now", "Adoyo"));
        repository.deleteById(1);
        repository.selectById(2);

        System.out.println(repository.selectById(2));
        System.out.println(repository.selectById(3));

    }
}

package com.in28minutes.springboot.learnjpaandhibernate.course;

import com.in28minutes.springboot.learnjpaandhibernate.course.jdbc.CourseJdbcRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

    @Autowired
    private CourseJdbcRepository courseJdbcRepository;

    @Override
    public void run(String... args) throws Exception {
        courseJdbcRepository.insertQuery(new Course(1, "Learn AWS Now", "Adoyo"));
        courseJdbcRepository.insertQuery(new Course(2, "Learn Azure Now", "Adoyo"));
        courseJdbcRepository.insertQuery(new Course(3, "Learn DevOps Now", "Adoyo"));
        courseJdbcRepository.deleteById(1);
        courseJdbcRepository.selectById(2);

        System.out.println(courseJdbcRepository.selectById(2));
        System.out.println(courseJdbcRepository.selectById(3));

    }
}

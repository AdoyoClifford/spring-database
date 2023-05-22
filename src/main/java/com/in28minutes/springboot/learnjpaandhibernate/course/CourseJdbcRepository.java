package com.in28minutes.springboot.learnjpaandhibernate.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CourseJdbcRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    private static String INSERT_QUERY = """ 
            insert into course (id,name,author)
            values (1,'John','in28minutes');
            """;

    public void insertQuery() {
        jdbcTemplate.update(INSERT_QUERY);
    }

}

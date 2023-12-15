package com.chunyue.spring6.jdbc;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.jdbc.core.JdbcTemplate;

@Component
public class EmployeeController {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void addEmployee() {
        String sql = "INSERT INTO employee VALUES(NULL, ?, ?, ?)";
        int rows = jdbcTemplate.update(sql, "chunyue", 25, "M");
        System.out.println(rows + " rows affected");
    }

}

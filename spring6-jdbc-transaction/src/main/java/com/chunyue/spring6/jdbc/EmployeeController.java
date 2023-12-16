package com.chunyue.spring6.jdbc;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EmployeeController {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void addEmployee() {
        String sql = "INSERT INTO employee VALUES(NULL, ?, ?, ?)";
        int rows = jdbcTemplate.update(sql, "chunyue", 25, "M");
        System.out.println(rows + " rows affected");
    }

    public void updateEmployee() {
        String sql = "UPDATE employee SET NAME=? WHERE ID=?";
        int rows = jdbcTemplate.update(sql, "bobby", 1);
        System.out.println(rows + " rows affected");
    }

    public void deleteEmployee() {
        String sql = "DELETE FROM employee WHERE ID=?";
        int rows = jdbcTemplate.update(sql, 1);
        System.out.println(rows + " rows affected");
    }

    public void getEmployee(Integer id) {
        String sql = "SELECT * FROM employee WHERE ID=?";
        Employee result = jdbcTemplate.queryForObject(sql,
                (rs,rowNum) -> {
                    Employee employee = new Employee();
                    employee.setName(rs.getString("name"));
                    employee.setAge(rs.getInt("age"));
                    employee.setSex(rs.getString("name"));
                    return employee;
                }, id);
        System.out.println(result);
    }

    public void getEmployeeEasier(Integer id) {
        String sql = "SELECT * FROM employee WHERE ID=?";
        Employee result = jdbcTemplate.queryForObject(sql,
                new BeanPropertyRowMapper<>(Employee.class),
                id);
        System.out.println(result);
    }

    public void getAllEmployees() {
        String sql = "SELECT * FROM employee";
        List<Employee> employees = jdbcTemplate.query(sql,
                new BeanPropertyRowMapper<>(Employee.class));
        System.out.println(employees);
    }

    public void getSingleValue() {
        String sql = "SELECT count(*) FROM employee";
        Integer count = jdbcTemplate.queryForObject(sql, Integer.class);
        System.out.println("Total number of employee: " + count);
    }

}

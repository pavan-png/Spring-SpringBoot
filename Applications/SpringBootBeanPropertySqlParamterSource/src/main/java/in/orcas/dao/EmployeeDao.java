package in.orcas.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import in.orcas.model.Employee;

@Repository
public class EmployeeDao {

    @Autowired
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    // Insert using BeanPropertySqlParameterSource
    public int save(Employee employee) {
        String sql = "INSERT INTO emp13 (id, name, email, salary, department) " +
                     "VALUES (:id, :name, :email, :salary, :department)";

        BeanPropertySqlParameterSource paramSource = new BeanPropertySqlParameterSource(employee);
        return namedParameterJdbcTemplate.update(sql, paramSource);
    }

    // Select all employees
    public List<Employee> getAll() {
        String sql = "SELECT * FROM emp13";
        return namedParameterJdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Employee.class));
    }
}

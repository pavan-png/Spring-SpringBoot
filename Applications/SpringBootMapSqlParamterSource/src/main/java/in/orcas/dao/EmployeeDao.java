package in.orcas.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import in.orcas.model.Employee;

@Repository
public class EmployeeDao {

    @Autowired
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    // INSERT operation using MapSqlParameterSource
    public int save(Employee e) {
        String sql = "INSERT INTO emp13 (id, name, email, salary, department) " +
                     "VALUES (:id, :name, :email, :salary, :department)";

        MapSqlParameterSource params = new MapSqlParameterSource()
                .addValue("id", e.getId())
                .addValue("name", e.getName())
                .addValue("email", e.getEmail())
                .addValue("salary", e.getSalary())
                .addValue("department", e.getDepartment());

        return namedParameterJdbcTemplate.update(sql, params);
    }

    // SELECT operation using BeanPropertyRowMapper
    public List<Employee> getAll() {
        String sql = "SELECT * FROM emp13";
        return namedParameterJdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Employee.class));
    }
}

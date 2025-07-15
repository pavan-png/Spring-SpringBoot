package in.orcas.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import in.orcas.model.Employee;

@Repository
public class EmployeeDao {

    @Autowired
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    // Insert employee using Map
    public int save(Employee e) {
        String sql = "INSERT INTO emp13 (id, name, email, salary, department) " +
                     "VALUES (:id, :name, :email, :salary, :department)";

        Map<String, Object> params = new HashMap<>();
        params.put("id", e.getId());
        params.put("name", e.getName());
        params.put("email", e.getEmail());
        params.put("salary", e.getSalary());
        params.put("department", e.getDepartment());

        return namedParameterJdbcTemplate.update(sql, params);
    }

    // Retrieve all employees
    public List<Employee> getAll() {
        String sql = "SELECT * FROM emp13";
        return namedParameterJdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Employee.class));
    }
}

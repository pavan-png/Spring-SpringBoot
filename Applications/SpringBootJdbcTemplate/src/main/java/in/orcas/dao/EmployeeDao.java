package in.orcas.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import in.orcas.model.Employee;

@Repository
public class EmployeeDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public int save(Employee e) {
        String sql = "INSERT INTO emp13 (id, name, email, salary, department) VALUES (?, ?, ?, ?, ?)";
        return jdbcTemplate.update(sql, e.getId(), e.getName(), e.getEmail(), e.getSalary(), e.getDepartment());
    }

    public List<Employee> getAll() {
        String sql = "SELECT * FROM emp13";

        RowMapper<Employee> rowMapper = new RowMapper<Employee>() {
            @Override
            public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
                Employee e = new Employee();
                e.setId(rs.getInt("id"));
                e.setName(rs.getString("name"));
                e.setEmail(rs.getString("email"));
                e.setSalary(rs.getDouble("salary"));
                e.setDepartment(rs.getString("department"));
                return e;
            }
        };

        return jdbcTemplate.query(sql, rowMapper);
    }
}

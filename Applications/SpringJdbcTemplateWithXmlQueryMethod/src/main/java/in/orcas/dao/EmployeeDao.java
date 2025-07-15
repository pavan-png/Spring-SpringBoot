package in.orcas.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import in.orcas.model.Employee;

public class EmployeeDao {
    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public int save(Employee emp) {
        String sql = "INSERT INTO employee(id, name) VALUES (?, ?)";
        return jdbcTemplate.update(sql, emp.getId(), emp.getName());
    }

    public List<Employee> getAll() {
        String sql = "SELECT * FROM employee";

        RowMapper<Employee> rowMapper = new RowMapper<Employee>() {
            @Override
            public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
                Employee e = new Employee();
                e.setId(rs.getInt("id"));
                e.setName(rs.getString("name"));
                
                return e;
            }
        };

        return jdbcTemplate.query(sql, rowMapper);
    }
}

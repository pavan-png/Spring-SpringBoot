package in.orcas.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import in.orcas.model.Employee;


public class EmployeeDao {

    private JdbcTemplate jdbcTemplate;

    // Setter for dependency injection via XML
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    // Insert method
    public int save(Employee e) {
        String sql = "INSERT INTO emp13 (id, name, email, salary, department) VALUES (?, ?, ?, ?, ?)";
        return jdbcTemplate.update(sql, e.getId(), e.getName(), e.getEmail(), e.getSalary(), e.getDepartment());
    }
}

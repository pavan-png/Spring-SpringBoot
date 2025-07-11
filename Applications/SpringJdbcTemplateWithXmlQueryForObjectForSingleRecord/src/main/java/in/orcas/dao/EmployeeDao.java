package in.orcas.dao;

import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeDao {
    private JdbcTemplate jdbcTemplate;

    // Setter for DI via XML
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    // Get only employee name by ID using queryForObject
    public String getEmployeeNameById(int id) {
        String sql = "SELECT name FROM employee WHERE id = ?";
        return jdbcTemplate.queryForObject(sql, String.class, id);
    }
}

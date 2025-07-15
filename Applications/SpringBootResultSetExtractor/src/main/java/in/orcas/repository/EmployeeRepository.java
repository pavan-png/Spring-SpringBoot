package in.orcas.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

import in.orcas.model.Employee;

@Repository
public class EmployeeRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Employee> getAllEmployees() {
        String sql = "SELECT * FROM emp13";

        ResultSetExtractor<List<Employee>> extractor = new ResultSetExtractor<List<Employee>>() {
            public List<Employee> extractData(ResultSet rs) throws SQLException {
                List<Employee> list = new ArrayList<>();
                while (rs.next()) {
                    Employee e = new Employee();
                    e.setId(rs.getInt("id"));
                    e.setName(rs.getString("name"));
                    e.setEmail(rs.getString("email"));
                    e.setSalary(rs.getDouble("salary"));
                    e.setDepartment(rs.getString("department"));
                    list.add(e);
                }
                return list;
            }
        };

        return jdbcTemplate.query(sql, extractor);
    }
}

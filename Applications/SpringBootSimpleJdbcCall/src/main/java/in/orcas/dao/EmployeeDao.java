package in.orcas.dao;

import java.sql.Types;
import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

import in.orcas.model.Employee;

@Repository
public class EmployeeDao {

    private DataSource dataSource;

    @Autowired
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }
    
    public String save(Employee e) {
        SimpleJdbcCall simpleJdbcCall = new SimpleJdbcCall(dataSource)
            .withProcedureName("insert_employee_proc")
            .declareParameters(
                new SqlParameter("p_id", Types.INTEGER),
                new SqlParameter("p_name", Types.VARCHAR),
                new SqlParameter("p_email", Types.VARCHAR),
                new SqlOutParameter("p_status", Types.VARCHAR)
            );

        Map<String, Object> params = new HashMap<>();
        params.put("p_id", e.getId());
        params.put("p_name", e.getName());
        params.put("p_email", e.getEmail());

        Map<String, Object> result = simpleJdbcCall.execute(params);
        return (String) result.get("p_status");
    }
}

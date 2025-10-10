package in.orcas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.orcas.dao.EmployeeDao;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

    @Autowired
    private EmployeeDao dao;

    @Override
    public void registerEmployee() {
        System.out.println("Service Layer: Calling DAO to save employee...");
        dao.saveEmployee();
    }
}

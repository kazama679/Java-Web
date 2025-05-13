package ra.com.service;

import ra.com.model.Employee;

import java.util.List;

public interface EmployeesService {
    List<Employee> findAll();
    Employee findById(int id);
    boolean addEmployee(Employee employee);
    boolean updateEmployee(Employee employee);
    boolean deleteEmployee(int id);
}

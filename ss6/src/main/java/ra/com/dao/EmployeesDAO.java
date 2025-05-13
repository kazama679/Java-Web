package ra.com.dao;

import ra.com.model.Employee;

import java.util.List;

public interface EmployeesDAO {
    List<Employee> findAll();
    Employee findById(int id);
    boolean addEmployee(Employee employee);
    boolean updateEmployee(Employee employee);
    boolean deleteEmployee(int id);
}
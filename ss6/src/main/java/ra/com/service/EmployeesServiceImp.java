package ra.com.service;

import ra.com.dao.EmployeesDAO;
import ra.com.dao.EmployeesDAOImp;
import ra.com.model.Employee;

import java.util.List;

public class EmployeesServiceImp implements EmployeesService {
    private final EmployeesDAO employeesDAO;

    public EmployeesServiceImp() {
        employeesDAO = new EmployeesDAOImp();
    }

    @Override
    public List<Employee> findAll() {
        return employeesDAO.findAll();
    }

    @Override
    public Employee findById(int id) {
        return employeesDAO.findById(id);
    }

    @Override
    public boolean addEmployee(Employee employee) {
        return employeesDAO.addEmployee(employee);
    }

    @Override
    public boolean updateEmployee(Employee employee) {
        return employeesDAO.updateEmployee(employee);
    }

    @Override
    public boolean deleteEmployee(int id) {
        return employeesDAO.deleteEmployee(id);
    }
}

package ra.com.dao;

import ra.com.model.Employee;
import ra.com.utils.ConnectionDB;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeesDAOImp implements EmployeesDAO {
    @Override
    public List<Employee> findAll() {
        Connection conn = null;
        CallableStatement callSt = null;
        List<Employee> employees = new ArrayList<>();
        try {
            conn = ConnectionDB.openConnection();
            callSt = conn.prepareCall("{call find_all_employees()}");
            ResultSet rs = callSt.executeQuery();
            while (rs.next()) {
                Employee emp = new Employee();
                emp.setId(rs.getInt("id"));
                emp.setName(rs.getString("name"));
                emp.setBirthday(rs.getString("birthday"));
                emp.setPhone(rs.getString("phone"));
                emp.setEmail(rs.getString("email"));
                emp.setSalary(rs.getString("salary"));
                emp.setPosition(rs.getString("position"));
                employees.add(emp);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            ConnectionDB.closeConnection(conn, callSt);
        }
        return employees;
    }

    @Override
    public Employee findById(int id) {
        Connection conn = null;
        CallableStatement callSt = null;
        Employee emp = null;
        try {
            conn = ConnectionDB.openConnection();
            callSt = conn.prepareCall("{call find_by_id_employee(?)}");
            callSt.setInt(1, id);
            ResultSet rs = callSt.executeQuery();
            if (rs.next()) {
                emp = new Employee();
                emp.setId(rs.getInt("id"));
                emp.setName(rs.getString("name"));
                emp.setBirthday(rs.getString("birthday"));
                emp.setPhone(rs.getString("phone"));
                emp.setEmail(rs.getString("email"));
                emp.setSalary(rs.getString("salary"));
                emp.setPosition(rs.getString("position"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            ConnectionDB.closeConnection(conn, callSt);
        }
        return emp;
    }

    @Override
    public boolean addEmployee(Employee emp) {
        Connection conn = null;
        CallableStatement callSt = null;
        boolean result = false;
        try {
            conn = ConnectionDB.openConnection();
            callSt = conn.prepareCall("{call add_employee(?,?,?,?,?,?)}");
            callSt.setString(1, emp.getName());
            callSt.setString(2, emp.getBirthday());
            callSt.setString(3, emp.getPhone());
            callSt.setString(4, emp.getEmail());
            callSt.setString(5, emp.getSalary());
            callSt.setString(6, emp.getPosition());
            callSt.executeUpdate();
            result = true;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            ConnectionDB.closeConnection(conn, callSt);
        }
        return result;
    }

    @Override
    public boolean updateEmployee(Employee emp) {
        Connection conn = null;
        CallableStatement callSt = null;
        boolean result = false;
        try {
            conn = ConnectionDB.openConnection();
            callSt = conn.prepareCall("{call update_employee(?,?,?,?,?,?,?)}");
            callSt.setInt(1, emp.getId());
            callSt.setString(2, emp.getName());
            callSt.setString(3, emp.getBirthday());
            callSt.setString(4, emp.getPhone());
            callSt.setString(5, emp.getEmail());
            callSt.setString(6, emp.getSalary());
            callSt.setString(7, emp.getPosition());
            callSt.executeUpdate();
            result = true;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            ConnectionDB.closeConnection(conn, callSt);
        }
        return result;
    }

    @Override
    public boolean deleteEmployee(int id) {
        Connection conn = null;
        CallableStatement callSt = null;
        boolean result = false;
        try {
            conn = ConnectionDB.openConnection();
            callSt = conn.prepareCall("{call delete_employee(?)}");
            callSt.setInt(1, id);
            callSt.executeUpdate();
            result = true;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            ConnectionDB.closeConnection(conn, callSt);
        }
        return result;
    }
}
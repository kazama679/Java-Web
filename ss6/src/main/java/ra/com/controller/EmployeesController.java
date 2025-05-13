package ra.com.controller;

import ra.com.dao.EmployeesDAO;
import ra.com.dao.EmployeesDAOImp;
import ra.com.model.Employee;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "EmployeesController", value = "/EmployeesController")
public class EmployeesController extends HttpServlet {
    private final EmployeesDAO employeesDAO;

    public EmployeesController() {
        employeesDAO = new EmployeesDAOImp();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            findAllEmployees(request, response);
            return;
        }

        switch (action) {
            case "findAll":
                findAllEmployees(request, response);
                break;
            case "update":
                int id = Integer.parseInt(request.getParameter("id"));
                Employee emp = employeesDAO.findById(id);
                if (emp != null) {
                    request.setAttribute("employee", emp);
                    request.getRequestDispatcher("bai4/formEdit.jsp").forward(request, response);
                }
                break;
            case "delete":
                int deleteId = Integer.parseInt(request.getParameter("id"));
                boolean result = employeesDAO.deleteEmployee(deleteId);
                if (result) {
                    findAllEmployees(request, response);
                } else {
                    request.getRequestDispatcher("bai1/error.jsp").forward(request, response);
                }
                break;
        }
    }

    public void findAllEmployees(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Employee> employees = employeesDAO.findAll();
        request.setAttribute("employees", employees);
        request.getRequestDispatcher("bai4/listEmployee.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String action = request.getParameter("action");

        if ("Create".equals(action)) {
            Employee emp = new Employee();
            emp.setName(request.getParameter("name"));
            emp.setBirthday(request.getParameter("birthday"));
            emp.setPhone(request.getParameter("phone"));
            emp.setEmail(request.getParameter("email"));
            emp.setSalary(request.getParameter("salary"));
            emp.setPosition(request.getParameter("position"));
            boolean result = employeesDAO.addEmployee(emp);
            if (result) {
                findAllEmployees(request, response);
            } else {
                request.getRequestDispatcher("bai1/error.jsp").forward(request, response);
            }
        } else if ("Update".equals(action)) {
            Employee emp = new Employee();
            emp.setId(Integer.parseInt(request.getParameter("id")));
            emp.setName(request.getParameter("name"));
            emp.setBirthday(request.getParameter("birthday"));
            emp.setPhone(request.getParameter("phone"));
            emp.setEmail(request.getParameter("email"));
            emp.setSalary(request.getParameter("salary"));
            emp.setPosition(request.getParameter("position"));
            boolean result = employeesDAO.updateEmployee(emp);
            if (result) {
                findAllEmployees(request, response);
            } else {
                request.getRequestDispatcher("bai1/error.jsp").forward(request, response);
            }
        }
    }
}
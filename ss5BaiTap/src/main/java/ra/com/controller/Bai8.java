package ra.com.controller;

import ra.com.model.B8;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "Bai8", value = "/Bai8")
public class Bai8 extends HttpServlet {
    private List<B8> tasks = new ArrayList<>();
    private int taskIdCounter = 1;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String action = request.getParameter("action");
        if (action == null) {
            request.setAttribute("tasks", tasks);
            request.getRequestDispatcher("view/tasks.jsp").forward(request, response);
        } else if (action.equals("add")) {
            request.getRequestDispatcher("view/task_form.jsp").forward(request, response);
        } else if (action.equals("edit")) {
            int id = Integer.parseInt(request.getParameter("id"));
            B8 task = findTaskById(id);
            request.setAttribute("task", task);
            request.getRequestDispatcher("view/task_form.jsp").forward(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String action = request.getParameter("action");
        if (action.equals("create")) {
            String description = request.getParameter("description");
            String dueDate = request.getParameter("dueDate");
            B8 task = new B8(taskIdCounter++, description, dueDate, false);
            tasks.add(task);
        } else if (action.equals("update")) {
            int id = Integer.parseInt(request.getParameter("id"));
            B8 task = findTaskById(id);
            task.setDescription(request.getParameter("description"));
            task.setDueDate(request.getParameter("dueDate"));
            task.setCompleted("on".equals(request.getParameter("completed")));
        } else if (action.equals("delete")) {
            int id = Integer.parseInt(request.getParameter("id"));
            tasks.removeIf(task -> task.getId() == id);
        }
        response.sendRedirect("tasks");
    }

    private B8 findTaskById(int id) {
        return tasks.stream().filter(task -> task.getId() == id).findFirst().orElse(null);
    }
}
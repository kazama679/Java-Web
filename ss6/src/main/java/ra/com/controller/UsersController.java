package ra.com.controller;

import ra.com.model.User;
import ra.com.service.UserService;
import ra.com.service.UserServiceImp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "UsersController", value = "/UsersController")
public class UsersController {
    private final UserService usersService;

    public UsersController() {
        usersService = new UserServiceImp();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");

        // Lấy thông tin từ form
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String email = request.getParameter("email");
        String phone = request.getParameter("phone");

        // Kiểm tra thông tin đầu vào
        if (username == null || username.isEmpty() ||
                password == null || password.isEmpty() ||
                email == null || email.isEmpty() ||
                phone == null || phone.isEmpty()) {
            request.setAttribute("message", "Vui lòng điền đầy đủ thông tin.");
            request.getRequestDispatcher("bai2/register.jsp").forward(request, response);
            return;
        }

        // Kiểm tra username đã tồn tại chưa
        List<User> users = usersService.findAll();
        if (users.stream().anyMatch(u -> u.getUsername().equals(username))) {
            request.setAttribute("message", "Username đã tồn tại.");
            request.getRequestDispatcher("bai2/register.jsp").forward(request, response);
            return;
        }

        // Tạo đối tượng User mới
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        user.setEmail(email);
        user.setPhone(phone);

        // Gọi service để thêm người dùng mới
        boolean result = usersService.addUser(user);
        if (result) {
            response.sendRedirect("bai2/login.jsp");
        } else {
            request.setAttribute("message", "Đăng ký thất bại. Vui lòng thử lại.");
            request.getRequestDispatcher("bai2/register.jsp").forward(request, response);
        }
    }
}

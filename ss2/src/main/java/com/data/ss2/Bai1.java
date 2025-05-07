package com.data.ss2;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "Bai1", value = "/lifecycle")
public class Bai1 extends HttpServlet {
    private String message;

    public void init() {
        System.out.println("Servlet dang tao");
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("🔁 Xử lý yêu cầu của người dùng: doGet()");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html><head><title>Vòng đời Servlet</title></head><body>");
        out.println("<h1>Vòng đời của Servlet</h1>");
        out.println("<ul>");
        out.println("<li><strong>init():</strong> Được gọi một lần duy nhất khi Servlet được khởi tạo.</li>");
        out.println("<li><strong>service():</strong> Được gọi mỗi khi có request đến Servlet. " + "Trong Servlet kế thừa HttpServlet, service() sẽ gọi doGet(), doPost(),...</li>");
        out.println("<li><strong>doGet():</strong> Xử lý các yêu cầu GET từ client (ví dụ trình duyệt).</li>");
        out.println("<li><strong>destroy():</strong> Được gọi một lần duy nhất trước khi Servlet bị xóa khỏi bộ nhớ.</li>");
        out.println("</ul>");
        out.println("<p>Servlet này minh họa đầy đủ các bước trong vòng đời của một Servlet.</p>");
        out.println("</body></html>");
    }

    public void destroy() {
        System.out.println("huy");
    }
}
package com.data.ss3;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "Bai8", value = "/Bai8")
public class Bai8 extends HttpServlet {
    public static final List<Book> books = new ArrayList<>();

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String title = request.getParameter("title");
        String author = request.getParameter("author");
        String year = request.getParameter("year");
        Book book = new Book(title, author, year);
        books.add(book);
        response.sendRedirect("bookList.jsp");
    }
}
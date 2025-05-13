package ra.com.controller;

import ra.com.model.Book;
import ra.com.model.User;
import ra.com.service.BooksService;
import ra.com.service.BooksServiceImp;
import ra.com.service.UserService;
import ra.com.service.UserServiceImp;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "BooksController", value = "/BooksController")
public class BooksController extends HttpServlet {
    private final BooksService booksService;
    private static final UserService customerService = new UserServiceImp();

    public BooksController() {
        booksService = new BooksServiceImp();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        String username = request.getParameter("username");
//        String password = request.getParameter("password");
//        List<User> users = customerService.findAll();
//        if(!users.stream().anyMatch(u -> u.getUsername().equals(username) && u.getPassword().equals(password))){
//            response.sendRedirect("bai2/login.jsp");
//            return;
//        }
        String action = request.getParameter("action");
        if (action.equals("findAll")) {
            findAllBooks(request, response);
        } else if (action.equals("update")) {
            int id = Integer.parseInt(request.getParameter("id"));
            Book book = booksService.findById(id);
            if (book != null) {
                request.setAttribute("book", book);
                request.getRequestDispatcher("bai1/formEdit.jsp").forward(request, response);
            }
        } else if (action.equals("delete")) {
            int id = Integer.parseInt(request.getParameter("id"));
            boolean result = booksService.deleteBook(id);
            if (result) {
                findAllBooks(request, response);
            } else {
                request.getRequestDispatcher("bai1/error.jsp").forward(request, response);
            }
        }
    }

    public void findAllBooks(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Book> books = booksService.findAll();
        request.setAttribute("books", books);
        request.getRequestDispatcher("bai1/listBook.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String action = request.getParameter("action");
        if (action.equals("Create")) {
            Book book = new Book();
            book.setTitle(request.getParameter("title"));
            book.setAuthor(request.getParameter("author"));
            book.setCategory(request.getParameter("category"));
            book.setQuantity(Integer.parseInt(request.getParameter("quantity")));
            boolean result = booksService.addBook(book);
            if (result) {
                findAllBooks(request, response);
            } else {
                request.getRequestDispatcher("bai1/error.jsp").forward(request, response);
            }
        } else if (action.equals("Update")) {
            Book book = new Book();
            book.setId(Integer.parseInt(request.getParameter("id")));
            book.setTitle(request.getParameter("title"));
            book.setAuthor(request.getParameter("author"));
            book.setCategory(request.getParameter("category"));
            book.setQuantity(Integer.parseInt(request.getParameter("quantity")));
            boolean result = booksService.updateBook(book);
            if (result) {
                findAllBooks(request, response);
            } else {
                request.getRequestDispatcher("bai1/error.jsp").forward(request, response);
            }
        }
    }
}
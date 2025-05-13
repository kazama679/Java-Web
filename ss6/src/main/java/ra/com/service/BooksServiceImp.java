package ra.com.service;

import ra.com.dao.BooksDAO;
import ra.com.dao.BooksDAOImp;
import ra.com.model.Book;

import java.util.List;

public class BooksServiceImp implements BooksService {
    private final BooksDAO booksDAO;

    public BooksServiceImp() {
        booksDAO = new BooksDAOImp();
    }

    @Override
    public List<Book> findAll() {
        return booksDAO.findAll();
    }

    @Override
    public Book findById(int id) {
        return booksDAO.findById(id);
    }

    @Override
    public boolean addBook(Book book) {
        return booksDAO.addBook(book);
    }

    @Override
    public boolean updateBook(Book book) {
        return booksDAO.updateBook(book);
    }

    @Override
    public boolean deleteBook(int id) {
        return booksDAO.deleteBook(id);
    }
}

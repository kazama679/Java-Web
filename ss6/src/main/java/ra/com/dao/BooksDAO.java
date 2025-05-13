package ra.com.dao;

import ra.com.model.Book;

import java.util.List;

public interface BooksDAO {
    List<Book> findAll();
    Book findById(int id);
    boolean addBook(Book book);
    boolean updateBook(Book book);
    boolean deleteBook(int id);
}
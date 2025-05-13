package ra.com.service;

import ra.com.model.Book;

import java.util.List;

public interface BooksService {
    List<Book> findAll();
    Book findById(int id);
    boolean addBook(Book book);
    boolean updateBook(Book book);
    boolean deleteBook(int id);
}

package ua.di1.library.controller;

import ua.di1.library.db.BookDao;
import ua.di1.library.db.ReaderDao;
import ua.di1.library.exception.LibraryException;
import ua.di1.library.exception.NoUserFoundException;
import ua.di1.library.model.Book;
import ua.di1.library.model.Reader;

import java.util.Date;
import java.util.List;

/**
 * Created by serhii on 14.05.16.
 */
public class LibraryControllerImpl implements LibraryController {

    private ReaderDao readerDao;
    private BookDao bookDao;

    @Override
    public List<Reader> getReaders() {
        return readerDao.allReaders();
    }

    @Override
    public List<Book> getAvailableBooks() {
        return bookDao.getAvailableBooks();
    }

    @Override
    public boolean addBook(Book book) {
        Book created = bookDao.createBook(book);
        return created != null;
    }

    @Override
    public boolean addReader(Reader reader) {
        return false;
    }

    @Override
    public boolean giveBookToReader(int bookId, int readerId) throws LibraryException {
        return false;
    }

    @Override
    public List<Book> getTakenBooks() {
        return null;
    }

    @Override
    public List<Book> getReaderBooks(int readerId) throws NoUserFoundException {
        return null;
    }

    @Override
    public boolean addToBlackList(int readerId) throws NoUserFoundException {
        return false;
    }

    @Override
    public List<Book> search(String author) {
        return null;
    }

    @Override
    public List<Book> search(Date from, Date to) {
        return null;
    }
}

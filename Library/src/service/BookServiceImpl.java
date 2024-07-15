package service;

import java.util.List;

import dao.BookDAO;
import dao.BookDAOImpl;
import dao.BookDAOImplDb;
import model.Book;

public class BookServiceImpl implements BookService{
	
	BookDAO bookDao = new BookDAOImplDb(); //BookService is dependent on BookDAO, . , . 

	@Override
	public Book add(String title, String author, String publisher) {
		return bookDao.add(title, author, publisher);
	}

	@Override
	public Book update(int bid, Book book) {
		return bookDao.update(bid, book);
	}

	@Override
	public List<Book> findByAuthor(String author) {
		return bookDao.findByAuthor(author);
	}

	@Override
	public Book find(int bid) {
		return bookDao.find(bid);
	}

	@Override
	public boolean remove(int bid) {
		return bookDao.remove(bid);
	}

	@Override
	public List<Book> findAll() {
		return bookDao.findAll();
	}

	@Override
	public List<Book> find(int start, int number) {
		List<Book> books = bookDao.find(start,number);
		return books;
	}

}

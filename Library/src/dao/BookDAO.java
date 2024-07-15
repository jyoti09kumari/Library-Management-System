package dao;

import java.util.List;

import model.Book;

public interface BookDAO {
	
	Book add(String title, String author, String publisher);
	Book update(int bid, Book book);
	List<Book> findByAuthor(String author);
	Book find(int bid);
	List<Book> find(int start, int number);
	boolean remove(int bid);
	List<Book> findAll();
	

	// select and press control /
}

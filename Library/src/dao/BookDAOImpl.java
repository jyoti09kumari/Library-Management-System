package dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import model.Book;

public class BookDAOImpl implements BookDAO
{
	private static Map<Integer,Book> map = new HashMap<>();//cont + shift + O
	static 
	{
		map.put(2101, new Book(2101, "C", "Ritchie", "Pearson"));
		map.put(2102, new Book(2102, "Java", "Herbert S", "Mcgraw Hill"));
		map.put(2103, new Book(2103, "Javascript", "Deitel", "UniversityPress"));
		map.put(2104, new Book(2104, "DBMS", "Korth", "Tata McGr"));
		map.put(2105, new Book(2105, "Java", "Herbert S", "Mcgraw Hill"));
		map.put(2106, new Book(2106, "Servlets", "OReily", "Mcgraw Hill"));
	}
	@Override
	public Book add(String title, String author, String publisher) {
		Set<Integer> keySet = map.keySet();
		int maxbid = Collections.max(keySet);
		int newbid = maxbid + 1;
		Book b = new Book(newbid, title, author, publisher);
		map.put(newbid,  b);
		return b;
	}
	@Override
	public Book update(int bid, Book book) {
		if(! map.containsKey(bid)) throw new RuntimeException("book does not exist to update");
		map.put(bid, book);
		return book;
	}
	@Override
	public List<Book> findByAuthor(String author) {
//		Collection<Book> values = map.values();
//		values.removeIf(bk -> ! bk.getAuthor().equals(author));
//		return new ArrayList<>(values);
		
		List<Book> mylist =new ArrayList<>();
		for(Book b : map.values())
		{
			if(b.getAuthor().contains(author))
				mylist.add(b);
		}
		return mylist;
		
		
//		return map.values().stream().filter(bk -> bk.getAuthor().equals(author)).collect(Collectors.toList());
		
	}

	@Override
	public Book find(int bid) {
		return map.get(bid);
	}

	@Override
	public boolean remove(int bid) {
		if(map.containsKey(bid)) 
		{
			map.remove(bid);
			return true;
		}
		return false;
	}

	@Override
	public List<Book> findAll() {
		Collection<Book> values = map.values();
		List<Book> list = new ArrayList<>(values);
		return list;
	}
	@Override
	public List<Book> find(int start, int number) {
		// get from DB
		List<Book> list = this.findAll();
		if(start < list.size() && start+number < list.size())
			return list.subList(start , start + number);
		else return list.subList(list.size() - number, list.size());
		
	}

}

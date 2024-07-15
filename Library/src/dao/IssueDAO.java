package dao;

import java.util.List;

import model.Book;
import model.Issue;

public interface IssueDAO {
	
	Issue add(int bid, int sid);
	Issue update(int isid, Issue issue);
	Issue find(int isid);
	List<Issue> findAll();
	

	// select and press control /
}

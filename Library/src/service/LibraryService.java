package service;

import model.Issue;

public interface LibraryService {
	Issue issueBook(int bid, int sid);
	Issue returnBook(int bid);

}

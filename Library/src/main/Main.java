package main;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import model.Issue;
import model.Student;
import service.BookService;
import service.BookServiceImpl;
import service.LibraryService;
import service.LibraryServiceImpl;
import service.StudentService;
import service.StudentServiceImpl;

public class Main {
	
	public static void main(String[] args) throws IOException {
		int choice = 0; 
		boolean adminLogined = false;
		Scanner sc = new Scanner(System.in);
		StudentService studentService = new StudentServiceImpl();
		BookService bookService = new BookServiceImpl();
		LibraryService libService = new LibraryServiceImpl();
		while(choice != 1)
		{
			System.out.println("1. Exit");
			System.out.println("2. Student Login");
			System.out.println("3. Admin Login");
			System.out.println("4. List all the students");
			System.out.println("5. List all the books");
			System.out.println("6. Seach book by Author");
			System.out.println("7. Issue Book ");
			clearSystemIn();
			choice = sc.nextInt();
			
			switch(choice)
			{
			case 1 : break;
			case 2 : break;
			case 3 : 
				clearSystemIn();
				System.out.println("Enter the password");

				String pass = sc.next();
				if(pass.equals("hello123"))
				{
					adminLogined = true;
				}
				else adminLogined = false;
				break;
			case 4: 
				if(!adminLogined) {
					System.out.println("enter as admin first");
					break;
				}
				List<Student> list = studentService.findAll();
				System.out.println(list);
				break;
				
			case 5:
				bookService.findAll().forEach(System.out::println);
				break;
			case 6:
				clearSystemIn();	
				if(sc.hasNextLine()) sc.nextLine();
				System.out.print("enter author name : ");
				String author = sc.nextLine();
				bookService.findByAuthor(author).forEach(System.out::println);;
				break;
			case 7:
				//issue book
				if(!adminLogined) {
					System.out.println("enter as admin first");
					break;
				}
				System.out.print("enter bid: ");
				int bid = sc.nextInt();
				System.out.print("enter sid : ");
				int sid = sc.nextInt();
				Issue issue = libService.issueBook(bid, sid);
				System.out.println("book issued as per "+ issue);
				break;
			}
			
		}
	}
	public static void clearSystemIn() throws IOException
	{
		while (System.in.available() > 0) {
		    System.in.read();         
		}
	}
	

}

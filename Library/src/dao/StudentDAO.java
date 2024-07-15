package dao;

import java.util.List;

import model.Student;

public interface StudentDAO {
	
	Student add(int roll, String name, String branch, String password);
	Student update(int roll, Student student);
	Student find(int roll, String password);
	Student find(int roll);
	boolean remove(int roll);
	List<Student> findAll();
	

	// select and press control /
}

package service;

import java.util.List;

import model.Student;

public interface StudentService {
	Student add(int roll, String name, String branch, String password);
	Student update(int roll, Student student);
	Student login(int roll, String password);
	Student find(int roll);
	boolean remove(int roll);
	List<Student> findAll();

}

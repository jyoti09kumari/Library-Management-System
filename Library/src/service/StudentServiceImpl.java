package service;

import java.util.List;

import dao.StudentDAO;
import dao.StudentDAOImpl;
import model.Student;

public class StudentServiceImpl implements StudentService{
	
	StudentDAO studentDao = new StudentDAOImpl(); //StudentService is dependent on StudentDAO, . , . 

	@Override
	public Student add(int roll, String name, String branch, String password) {
		return studentDao.add(roll, name, branch, password);
	}

	@Override
	public Student update(int roll, Student student) {
		return studentDao.update(roll, student);
	}

	@Override
	public Student login(int roll, String password) {
		return studentDao.find(roll,password);
	}

	@Override
	public Student find(int roll) {
		return studentDao.find(roll);
	}

	@Override
	public boolean remove(int roll) {
		return studentDao.remove(roll);
	}

	@Override
	public List<Student> findAll() {
		return studentDao.findAll();
	}

}

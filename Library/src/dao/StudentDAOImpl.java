package dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.Student;

public class StudentDAOImpl implements StudentDAO
{
	private static Map<Integer,Student> map = new HashMap<>();//cont + shift + O
	
	static 
	{
		map.put(101, new Student(101, "Sanjay", "CSE", "pass123"));
		map.put(102, new Student(102, "Arun", "IT", "pass123"));
		map.put(103, new Student(103, "Nipun", "CSE", "pass123"));
		map.put(104, new Student(104, "Varun", "CSE", "pass123"));
		map.put(105, new Student(105, "Satya", "ECE", "pass123"));
		
	}
	@Override
	public Student add(int roll, String name, String branch, String password) {
		if(map.containsKey(roll))
		{
			throw new RuntimeException("Student already exists");
		}
		Student s = new Student(roll, name, branch, password);
		map.put(roll,  s);
		return s;
	}

	@Override
	public Student update(int roll, Student student) {
		if(! map.containsKey(roll)) throw new RuntimeException("student does not exist to update");
		map.put(roll, student);
		return student;
	}

	@Override
	public Student find(int roll, String password) {
		Student s = map.get(roll); 
		if(s == null) return null;
		if(s.getPassword().equals(password))
			return s;
		return null;
	}

	@Override
	public Student find(int roll) {
		return map.get(roll);
	}

	@Override
	public boolean remove(int roll) {
		if(map.containsKey(roll)) 
		{
			map.remove(roll);
			return true;
		}
		return false;
	}

	@Override
	public List<Student> findAll() {
		Collection<Student> values = map.values();
		List<Student> list = new ArrayList<>(values);
		return list;
	}

}

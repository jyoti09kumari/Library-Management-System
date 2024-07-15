package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.Book;
import model.Student;

public class StudentDAOImplDB implements StudentDAO
{

	@Override
	public Student add(int roll, String name, String branch, String password) {
		//		Connection connection = DbConnection.getConnection();
		//		String sql = "insert into student values (?,?,?,?,?,?,?)";
		//		PreparedStatement pst = connection.prepareStatement(sql);


		Student s = new Student(roll, name, branch, password);
		return s;
	}

	@Override
	public Student update(int roll, Student student) {
		//		if(! map.containsKey(roll)) throw new RuntimeException("student does not exist to update");
		//		map.put(roll, student);
		return student;
	}

	@Override
	public Student find(int roll, String password) {
		//		Connection connection = DbConnection.getConnection();
		//		String sql  = "select * from student where roll = ? and password = ?";
		//		PreparedStatement pst = connection.prepareStatement(sql);
		//		pst.setInt((1, roll);
		//		pst.setString(2, password);
		//		pst.executeQuery();
		//		ResultSet resultSet = pst.getResultSet();
		//		if(resultSet.next())
		//		{
		//			//get student from resultSet and return
		//			int rollInt = resultSet.getInt(1); //roll is 1st column
		//			String name = resultSet.getString("name");
		//			String branch = resultSet.getString("branch");
		//			int numBooks = resultSet.getInt("numbooks");
		//			String passwordDb = resultSet.getString("password");
		//			String email = resultSet.getString("email");
		//			Date dob = resultSet.getDate("dob");
		//			Student s = new Student(rollInt,name, branch, password);
		//			return s;
		//		}
		return null;

	}

	@Override
	public Student find(int roll) {
		//		return map.get(roll);
		return null;
	}

	@Override
	public boolean remove(int roll) {
		//		if(map.containsKey(roll)) 
		//		{
		//			map.remove(roll);
		//			return true;
		//		}
		return false;
	}

	@Override
	public List<Student> findAll() {
//		try
//		{
//			Connection connection = DbConnection.getConnection();
//			String sql  = "select * from student";
//			PreparedStatement pst = connection.prepareStatement(sql);
//			List<Student> list = new ArrayList<>();
//			pst.executeQuery();
//			ResultSet resultSet = pst.getResultSet();
//			while(resultSet.next())
//			{
//				//get student from resultSet and return
//				int bid = resultSet.getInt("bid");
//				int bookTypeid = resultSet.getInt("booktypeid");
//				String title = resultSet.getString("title");
//				String author= resultSet.getString("author");
//				String publisher= resultSet.getString("publisher");
//				int isid = = resultSet.getInt("isid");
//				Book b  = new Book(bid, title, author, publisher);
//				b.setBookTypeid(bookTypeid);
//				b.setIsid(isid);
//				
//				list.add(b);
//			}
//			return list;
//		}
//		catch(Exception e)
//		{
//			e.printStackTrace();
//			return null;
//		}
		return null;
	}

}

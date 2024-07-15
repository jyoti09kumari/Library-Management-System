package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {

	private static Connection connection = null;
	public static Connection getConnection()
	{
		try
		{
			if(connection == null || connection.isClosed())
			{
				Class.forName("com.mysql.cj.jdbc.Driver");
				connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/lpu24", "root", "password");
				return connection;
			}
			else return connection;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return null;
		}
	}
	public static  void closeConnection()
	{
		try
		{
			connection.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}

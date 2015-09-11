package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import bean.AddEmployeeBean;

public class AddEmployeeDataBaseOperation 
{
	PreparedStatement ps = null;
	ResultSet re = null;
	Connection con = null;

	public AddEmployeeDataBaseOperation()
	{
		try
	{
		
	Class.forName("com.mysql.jdbc.Driver");//mysql driver name
	con = DriverManager.getConnection("jdbc:mysql://localhost:3306/carzDB", "root","root");
	
	}
		catch(Exception e)
		{
		System.out.println(e);
	}

}
	public void insertEmployeeDetails(AddEmployeeBean bean)
	{
		try
		{
		String query="insert into AddEmployee values(?,?,?,?,?,?,?)";
		ps = con.prepareStatement(query);
		ps.setString(1, bean.getEmployeeId());
		ps.setString(2, bean.getEmployeeName());
		ps.setString(3, bean.getDesignation());
		ps.setLong(4, bean.getMoblieNo());
		ps.setString(5, bean.getEmailId());
		ps.setString(6, bean.getAddress());
		ps.setString(6, bean.getJoiningDate());
		ps.setString(7, bean.getPreviousExperience());
		ps.executeUpdate();
		}
		
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
		try
		{
		ps.close();
		con.close();
		}
		catch(SQLException se)
		{
			System.out.println(se);
		}
		}
	}
}

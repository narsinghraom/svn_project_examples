package dao;

import java.sql.*;

import bean.AdminRegBean;


public class AdminDataBaseOperation 
{
	PreparedStatement ps=null;
	ResultSet rs=null;
    Connection con=null;
   
    public AdminDataBaseOperation() 
    {
    	   	 
    	try
    	{
    	
    		Class.forName("com.mysql.jdbc.Driver");
    	
    		con= DriverManager.getConnection("jdbc:mysql://localhost:3306/carzDB","root","root");
    
    		
    	}
    	catch(Exception e)
    	{
    		System.out.println(e);
    	}
    
    }

	public  boolean validate(AdminRegBean adimregbean)
	{
		boolean status=false;
		try {
			ps=con.prepareStatement("select * from admin where adminId=? and adminPassword=?");
			ps.setString(1, adimregbean.getAdminId());
	        
			ps.setString(2, adimregbean.getAdminPassword());
			rs=ps.executeQuery();
			status=rs.next();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
		return status;
	}
    
    
    
    
   /* public void insertAdminReg(AdminRegBean agb) throws SQLException
    {
    	try
    	{
    	String query="insert into admin values(?,?)";
    	ps = ((java.sql.Connection) con).prepareStatement(query);
    	ps.setString(1,agb.getAdminId());
    	ps.setString(2,agb.getAdminPassword());
    	int value=ps.executeUpdate();
    	System.out.println(value +"sucessfully enterd");
    	}
    	catch(Exception e)
    	{
    	System.out.println(e);	
    	}
    	ps.close();
    	con.close();
    
    }*/
}

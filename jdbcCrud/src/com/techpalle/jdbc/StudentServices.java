package com.techpalle.jdbc;
import java.sql.*; 

public class StudentServices {
	private static Connection cn = null;
	private static Statement stm = null;
	private static PreparedStatement ps = null;
	private static ResultSet rs = null;
	
	private static Connection myConnection() throws ClassNotFoundException, SQLException
	{
		// step:1 Load Driver class
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		// step:2 Establish Connection
	cn =DriverManager.getConnection("jdbc:mysql://localhost:3306/palle", "root", "Bjagadeesh@123");
	// return connection
	return cn;
	}
	
	public static void reading()
	{
		try {
			cn = myConnection();
			stm = cn.createStatement();
			String qry = "select * from student";
			rs = stm.executeQuery(qry);
			while(rs.next()) 
			{
				System.out.println(rs.getInt("sno"));
				System.out.println(rs.getString("sname"));
				System.out.println(rs.getString("sub"));
				System.out.println(rs.getString("email") + "\n");
			}
		} 
		catch (ClassNotFoundException | SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			if(rs != null)
			{
				try 
				{
					rs.close();
				}
				catch (SQLException e)
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(stm != null)
			{
				try
				{
					stm.close();
				} 
				catch (SQLException e)
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(cn != null)
			{
				try {
					cn.close();
				} 
				catch (SQLException e) 
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
	// updating
	
	public static void updating(int sno, String sub, String email)
	{
		try {
			cn = myConnection();
			String qry = "update student set sub = ?, email = ? where sno = ?";
			ps = cn.prepareStatement(qry);
			ps.setString(1, sub);
			ps.setString(2, email);
			ps.setInt(3, sno);
			ps.executeUpdate();
			
		} 
		catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			if(ps != null) {
				try {
					ps.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(cn != null)
			{
				try {
					cn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
	// deleting data from table
	
	public static void deleting(int sno)
	{				
		try {
			cn	= myConnection();
			String qry = "delete from student where sno = ?";
			ps = cn.prepareStatement(qry);
			ps.setInt(1, sno);	
			ps.executeUpdate();
				
			} 
		catch (ClassNotFoundException | SQLException e)
		{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			finally {
				if(ps != null) {
					try {
						ps.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				if(cn != null)
				{
					try {
						cn.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
	}
}
	
	//inserting method
	public static void inserting(String name, String sub, String email)
	{
		try {
			cn	= myConnection();
			String qry = "insert into student(sname,sub,email)values(?, ?, ?)";
			ps = cn.prepareStatement(qry);
			ps.setString(1, name);
			ps.setString(2,  sub);
			ps.setString(3, email);
			ps.executeUpdate();
				
			} 
		catch (ClassNotFoundException | SQLException e)
		{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			finally
			{
				if(ps != null) 
				{
					try
					{
						ps.close();
					} 
					catch (SQLException e) 
					{
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				if(cn != null)
				{
					try
					{
						cn.close();
					}
					catch (SQLException e) 
					{
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
	}
	
	// creating table
	
	public static void creating()
	{
		try 
		{
		cn	= myConnection();
			stm = cn.createStatement();
			String qry = "create table student( sno int primary key auto_increment, sname varchar(200), sub varchar(100), email varchar(100) unique)";
			stm.executeUpdate(qry);
			
		} 
		catch (ClassNotFoundException | SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			if(stm != null)
			{
				try 
				{
					stm.close();
				} 
				catch (SQLException e)
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(cn != null)
			{
				try 
				{
					cn.close();
				} 
				catch (SQLException e) 
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
	

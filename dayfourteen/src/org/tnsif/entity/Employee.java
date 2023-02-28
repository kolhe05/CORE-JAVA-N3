package org.tnsif.entity;

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.SQLException;

	//data access object layer
	public class Employee {
		
		public Employee(int nextInt, String next, String next2, String next3) {
			// TODO Auto-generated constructor stub
		}

		public Employee() {
			// TODO Auto-generated constructor stub
		}

		public Connection createConnection()
		{
			String url="jdbc:mysql://localhost:3306/N3";
			String user="root";
			String password="jenny";
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			}
			catch(ClassNotFoundException e)
			{
				System.out.println("Driver name not found"+e);
			}
			Connection connection;
			try
			{
				connection=DriverManager.getConnection(url, user, password);
			}
			catch(SQLException e)
			{
				connection=null;
				System.out.println("User/url/password error"+e);
			}
			return connection;
		}

		public int getUserid() {
			// TODO Auto-generated method stub
			return 0;
		}

		public void setUserid(int int1) {
			// TODO Auto-generated method stub
			
		}

		public void setUsername(String string) {
			// TODO Auto-generated method stub
			
		}

		public void setPassword(String string) {
			// TODO Auto-generated method stub
			
		}

		public void setEmail(String string) {
			// TODO Auto-generated method stub
			
		}

		public String getPassword() {
			// TODO Auto-generated method stub
			return null;
		}

		public String getEmail() {
			// TODO Auto-generated method stub
			return null;
		}

		
		}
		

	



package com.zuberia.jdbc;

import java.sql.*;

public class Customerdemo {
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}
		catch(ClassNotFoundException e){}
		}
	
	private static void createTable(Connection conn) throws SQLException {
	//create a new table under database student
			String sql_query="create table customer(custno INT AUTO_INCREMENT PRIMARY KEY,custname VARCHAR(100),custaddress VARCHAR(100),phoneno VARCHAR(255),city VARCHAR(50), pincode VARCHAR(10),country VARCHAR(50));";
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student?auto Reconnect=true&useSSL=false","root","system");
			Statement st=con.createStatement();
			//to create a table with columns
			st.executeUpdate(sql_query);
			//to my reference
			System.out.println("Table created successfully........");
	}
	
	private static void insertValues(Connection conn) throws SQLException {
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student?auto Reconnect=true&useSSL=false","root","system");
		Statement st=con.createStatement();
			//inserting values into table 
			String insert_query1 = "INSERT INTO Customer (Custname, Custaddress, Phoneno, City, Pincode, Country) "
	                + "VALUES ('John Doe', '123 Elm Street', '123-456-7890', 'Shimla', '171001', 'India')";
			String insert_query2 = "INSERT INTO Customer (Custname, Custaddress, Phoneno, City, Pincode, Country) "
	                + "VALUES ('Jane Smith', '456 Oak Avenue', '098-765-4321', 'Shimla', '171002', 'India')";
			st.executeUpdate(insert_query1);
			st.executeUpdate(insert_query2);
			//printing the statement
			System.out.println("Inserted values successfully.....");
	}
	
	private static void updateCity(Connection conn) throws SQLException {
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student?auto Reconnect=true&useSSL=false","root","system");
		Statement st=con.createStatement();
			//Updating the values where city =shimla to shillong
			String update_query = "UPDATE Customer SET City = 'Shillong' WHERE City = 'Shimla'";
			st.executeUpdate(update_query);
			System.out.println("Updating the records done successfully......");
	}
	
	 private static void deleteValues(Connection conn) throws SQLException {
		 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student?auto Reconnect=true&useSSL=false","root","system");
			Statement st=con.createStatement();
			//Delete customer with Custno = 1
			String delete_record = "DELETE FROM Customer WHERE Custno = 1"; 
			st.executeUpdate(delete_record);
			System.out.println("Records deleted successfully......"); 
	 }
	
	 private static void showTable(Connection conn) throws SQLException {
		 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student?auto Reconnect=true&useSSL=false","root","system");
			Statement st=con.createStatement();
			//fetching data from the console
			String selectSQL = "SELECT * FROM Customer";
			ResultSet rs = st.executeQuery(selectSQL);
			 while (rs.next()) {
	             System.out.println("Custno: " + rs.getInt("Custno") + ", Custname: " + rs.getString("Custname")
	                     + ", Custaddress: " + rs.getString("Custaddress")+ ", Phoneno: " + rs.getString("Phoneno")
	                     + ", City: " + rs.getString("City") + ", Pincode: " + rs.getString("Pincode")
	                     + ", Country: " + rs.getString("Country"));
			
		
			 }
		}



	public static void main(String[] args)throws Exception {
		Customerdemo  c = new Customerdemo();
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student?auto Reconnect=true&useSSL=false","root","system");
		c.createTable(con);
		c.insertValues(con);
		c.updateCity(con);
		c.deleteValues(con);
		c.showTable(con);
		
		
		
	
			
	}
}



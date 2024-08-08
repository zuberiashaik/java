package com.zuberia.jdbc;
import java.sql.*;
public class EmployeeUploader {
	static {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
	}
	catch(ClassNotFoundException e){}
	}

	 void storeDepartmentDetails(int d_id,String d_name,String d_Head,String d_Description) throws SQLException {
		 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","system");
		 //inserting values into department table
		 String insert_query="insert into department values(?,?,?,?)";
		 PreparedStatement pst=con.prepareStatement(insert_query);//to reference
		 pst.setInt(1,d_id);
		 pst.setString(2,d_name);
		 pst.setString(3,d_Head);
		 pst.setString(4,d_Description);
		 pst.executeUpdate();
		 System.out.println("Department Details inserted successfully.");
	}
	 void storeEmployeeDetails(int e_id,String e_name,String e_address,int e_salary,long e_contact_No,int d_id)throws SQLException {
		 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","system");
		 //inserting values into employee table
		 String insert_query="insert into employee values(?,?,?,?,?,?)";
		 PreparedStatement pst = con.prepareStatement(insert_query);
		 pst.setInt(1,e_id);
		 pst.setString(2,e_name);
		 pst.setString(3,e_address);
		 pst.setInt(4,e_salary);
		 pst.setLong(5,e_contact_No);
		 pst.setInt(6,d_id);
		 pst.executeUpdate();
		 System.out.println("Records inserted successfully");
	 }
		 void retrieveEmployeeDetails(int e_id)throws SQLException {
			 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","system");
			 String select_query = "SELECT e.e_id,e.e_name,e.e_address,e.e_salary,e.e_contact_No,d.d_name,d.d_Head"+"FROM employee e" + "JOIN department d ON e.d_id=d.d_id"+"WHERE e.e_id=?";
			 PreparedStatement pst = con.prepareStatement(select_query);
			 ResultSet rs = pst.executeQuery();
			 while(rs.next()) {
				 System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3)+"\t"+rs.getString(4)+"\t"+rs.getShort(5)+"\t"+rs.getString(6));
			 }
			 
		 }
		 
	 
	 
		

	public static void main(String[] args)throws SQLException {
		EmployeeUploader e = new EmployeeUploader();
		e.storeDepartmentDetails(101,"cs","riya","computer science");
		e.storeEmployeeDetails(200,"zubbu","hyd",50000,123456789,101);
		//retrieving employeedetails
        e.retrieveEmployeeDetails(200);
		
	}
	
		
	}




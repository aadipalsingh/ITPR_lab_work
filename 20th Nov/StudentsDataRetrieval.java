package com.dataconnectivity.studentportal;
import java.util.*;
import java.sql.*;//importing sql package for database operations
/*--- Program to fetch data from the mysql table using jdbc api
 * ------------------------------------------------
 * ---- Structure of the table -------
 * -----------------------------------------
 * Name of table : student
 * Database name : studentmanagement
 * ---------------------------------------
 * ----- Fields description ----
 * stdid - varchar(30) - primary key
 * stdname - varchar(300) - not null
 * standard - varchar(30) - not null
 * age - int - not null
 * -----------------------------------------
 * 
 * */
public class StudentsDataRetrieval {

	public static void main(String[] args) {
		//to create arraylist for storing students data
		ArrayList<Student> stdlist=new ArrayList<Student>();
		//declaration of Student object;
		Student studentdata;
		try
		{
			//url of database
			String url = "jdbc:mysql://localhost:3306/studentmanagement";
			String userid = "root";
			String password = "123456";
			//Step 1 : to establish connection
			Connection conref = DriverManager.getConnection(url,userid,password);
			
			//Step 2 : To create Statement
			Statement stmt = conref.createStatement();
			
			//Step 3 : To execute query to select data from table
			ResultSet dataset = stmt.executeQuery("select stdid,stdname,standard,age from student");
			//traversing into resultset
			while(dataset.next())
			{
				//to retrieve particular record 
				studentdata = new Student(dataset.getString(1),dataset.getString(2),dataset.getString(3),dataset.getInt(4));
				//to insert student data into arraylist
				stdlist.add(studentdata);
			}
			//to check arraylist has data or not
			if(stdlist.size() > 0)
			{
				System.out.println(stdlist);
			}
			else
			{
				System.out.println("No data found");
			}
			//Step 4: to close connection 
			conref.close();
		}
		catch(SQLException sqe)
		{
			System.out.println(sqe);
		}
	}

}

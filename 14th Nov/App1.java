package com.dataconnectivity.studentmanagement;
import java.sql.*;
import java.util.Scanner;
/*--- Program to insert data into the mysql table using jdbc api
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
public class App 
{
    public static void main( String[] args )
    {
    	try 
    	{
    		//Step 1: to load a driver. It is optional since java 6
    		Class.forName("com.mysql.cj.jdbc.Driver"); // mysql server 8.0 driver
    		//url of mysql
    		String url = "jdbc:mysql://localhost:3306/studentmanagement";
    		String userid = "root";
    		String password = "0011";
    		//Step 2 : to establish connection 
    		Connection conref = DriverManager.getConnection(url, userid,password);
    		//----------------------------------------------------------------
    		/*--- Input of data from user ----*/
    		//Creating object of the Scanner class
    		Scanner sc = new Scanner(System.in);
    		
    		System.out.print("Enter Student id : ");
    		String stdid = sc.nextLine();
    		
    		System.out.print("Enter Student Name : ");
    		String stdname = sc.nextLine();
    		
    		System.out.print("Enter standard : ");
    		String standard = sc.nextLine();
    		
    		System.out.print("Enter age(in year) : ");
    		int age = sc.nextInt();
    		sc.close();
    		/*--------------------------------------*/
    		//to create reference of PreparedStatement
    		PreparedStatement stmtref = conref.prepareStatement("insert into student values (?,?,?,?)");
    		//To set data into query placeholders
    		stmtref.setString(1, stdid);
    		stmtref.setString(2, stdname);
    		stmtref.setString(3, standard);
    		stmtref.setInt(4, age);
    		
    		//Step 4 : to execute query to insert data
    		int rows = stmtref.executeUpdate();
    		
    		//to check data inserted or not
    		if(rows > 0 )
    		{
    			System.out.println("Data Inserted");
    		}
    		else
    		{
    			System.out.println("Unable to insert data");
    		}
    		
    		//Step 5 : close the connection
    		conref.close();
    	}
    	catch(ClassNotFoundException cnfe)
    	{
    		System.out.println(cnfe);
    	}
    	catch(SQLException se)
    	{
    		System.out.println(se);
    	}
    }
}

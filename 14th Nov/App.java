package com.databaseconnectivity.employeemanagement;

import java.sql.*;//to use database connectivity

public class App {
    public static void main(String[] args) {

        try {
            String url = "jdbc:mysql://localhost:3306/employeemanagement";
            String userid = "root";
            String password = "0011";
            // to establish a connection
            Connection con = DriverManager.getConnection(url, userid, password);
            // to create statement
            Statement stmt = con.createStatement();
            // creating insert query
            String sqlquery = "insert into employee values('emp101','aditya',26,50000,'manager')";
            // to execute execute query
            int rows = stmt.executeUpdate(sqlquery);
            // to check data inserted or not
            if (rows > 0) {
                System.out.println("Data inserted");
            } else {
                System.out.println("Unable to insert data");
            }
            // to close connection
            con.close();

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}

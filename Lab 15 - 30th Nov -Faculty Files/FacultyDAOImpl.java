package com.knmodicollege.collegemanagemet.dao.Impl;

import java.sql.*;
import java.util.ArrayList;

import com.knmodicollege.collegemanagemet.dao.FacultyDAO;
import com.knmodicollege.collegemanagemet.models.Faculty;
import com.knmodicollege.collegemanagemet.util.DataBaseUtil;

/*---------------------------------------------------
 * ------- Structure Of the Faculty ---------
 * table : faculty
 * ------------------------------------------
 * fields - datatype - 
 * facultyid     - varchar(30)   - primary key
 * facultyname   - varchar(300)  - not null
 * qualification - varchar(500)  - not null
 * status        - varchar(50)   - not null
 * ---------------------------------------------------
 */

public class FacultyDAOImpl implements FacultyDAO {

	/*------------------------ SAVE --------------------------------*/
	@Override
	public int save(Faculty facultyData) 
	{
		int insertedRows = 0;
		try(Connection con = DataBaseUtil.establishConnection())
		{
			//creating reference of prepared statement
			PreparedStatement stmt = con.prepareStatement("insert into faculty values(?,?,?,?)");
			
			//setting query parameters
			stmt.setString(1, facultyData.getFacultyId());
			stmt.setString(2, facultyData.getFacultyName());
			stmt.setString(3, facultyData.getQualification());
			stmt.setString(4, facultyData.getStatus());
			
			//executing the insert query
			insertedRows = stmt.executeUpdate();
		}
		catch(SQLException sqe)
		{
			System.out.println(sqe);
		}
		return insertedRows;
	}

	/*------------------------ FIND ALL --------------------------------*/
	@Override
	public ArrayList<Faculty> findAll() 
	{
		ArrayList<Faculty> facultyList = new ArrayList<>();
		
		try(Connection con = DataBaseUtil.establishConnection())
		{
			//create statement
			Statement stmt = con.createStatement();
			
			//query to select all records
			String sqlQuery = "select facultyid, facultyname, qualification, status from faculty";
			
			//execute query
			ResultSet result = stmt.executeQuery(sqlQuery);
			
			//Faculty object
			Faculty faculty;
			
			while(result.next())
			{
				faculty = new Faculty();
				faculty.setFacultyId(result.getString(1));
				faculty.setFacultyName(result.getString(2));
				faculty.setQualification(result.getString(3));
				faculty.setStatus(result.getString(4));

				facultyList.add(faculty);
			}
		}
		catch(SQLException sqe)
		{
			System.out.println(sqe);
		}
		
		return facultyList;
	}

	/*------------------------ FIND BY ID --------------------------------*/
	@Override
	public Faculty findByFacultyId(String facultyId) 
	{
		Faculty faculty = null;

		try(Connection con = DataBaseUtil.establishConnection())
		{
			PreparedStatement stmt = con.prepareStatement(
					"select facultyid, facultyname, qualification, status from faculty where facultyid = ?"
			);
			
			//set parameter
			stmt.setString(1, facultyId);

			ResultSet result = stmt.executeQuery();
			
			if(result.next())
			{
				faculty = new Faculty();
				faculty.setFacultyId(result.getString(1));
				faculty.setFacultyName(result.getString(2));
				faculty.setQualification(result.getString(3));
				faculty.setStatus(result.getString(4));
			}
		}
		catch(SQLException sqe)
		{
			System.out.println(sqe);
		}

		return faculty;
	}

	/*------------------------ UPDATE STATUS --------------------------------*/
	@Override
	public int updateFacultyStatus(String facultyId, String status) 
	{
		int updatedRows = 0;
		
		try(Connection con = DataBaseUtil.establishConnection())
		{
			PreparedStatement stmt = con.prepareStatement(
					"update faculty set status = ? where facultyid = ?"
			);
			
			stmt.setString(1, status);
			stmt.setString(2, facultyId);
			
			updatedRows = stmt.executeUpdate();
		}
		catch(SQLException sqe)
		{
			System.out.println(sqe);
		}
		
		return updatedRows;
	}

	/*------------------------ UPDATE QUALIFICATION --------------------------------*/
	@Override
	public int updateQualification(String facultyId, String qualification) 
	{
		int updatedRows = 0;
		
		try(Connection con = DataBaseUtil.establishConnection())
		{
			PreparedStatement stmt = con.prepareStatement(
					"update faculty set qualification = ? where facultyid = ?"
			);
			
			stmt.setString(1, qualification);
			stmt.setString(2, facultyId);
			
			updatedRows = stmt.executeUpdate();
		}
		catch(SQLException sqe)
		{
			System.out.println(sqe);
		}
		
		return updatedRows;
	}

	/*------------------------ DELETE --------------------------------*/
	@Override
	public int delete(String facultyId) 
	{
		int deletedRows = 0;
		
		try(Connection con = DataBaseUtil.establishConnection())
		{
			PreparedStatement stmt = con.prepareStatement(
					"delete from faculty where facultyid = ?"
			);
			
			stmt.setString(1, facultyId);
			
			deletedRows = stmt.executeUpdate();
		}
		catch(SQLException sqe)
		{
			System.out.println(sqe);
		}
		
		return deletedRows;
	}
}

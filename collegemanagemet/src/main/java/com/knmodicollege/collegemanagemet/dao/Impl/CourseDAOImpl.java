package com.knmodicollege.collegemanagemet.dao.Impl;
import java.sql.*;
import java.util.*;
import com.knmodicollege.collegemanagemet.dao.CourseDAO;
import com.knmodicollege.collegemanagemet.models.course;
import com.knmodicollege.collegemanagemet.util.*;

public class CourseDAOImpl implements CourseDAO {

	@Override
	public int save(course CourseData) {
		int insertedRows = 0;
		try(Connection con = DataBaseUtil.establishConnection();)
		{
			
			/*--- creating reference of Prepared Statement interface ---*/
			PreparedStatement stmt = con.prepareStatement("insert into course values(?,?,?,?,?,?)");
			/*--- setting values into the query parameters */
			stmt.setString(1, CourseData.getCourseId());
			stmt.setString(2, CourseData.getCourseName());
			stmt.setString(3, CourseData.getDescription());
			stmt.setInt(4, CourseData.getDuration());
			stmt.setInt(5, CourseData.getMin_enrollment());
			stmt.setInt(6, CourseData.getMax_enrollment());
			/*-------------------------------------------------*/
			//executing the query
			insertedRows = stmt.executeUpdate();
		}
		catch(SQLException sqe)
		{
			System.out.println(sqe);
		}
		return insertedRows;
	}

	@Override
	public ArrayList<course> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public course findByCourseId(String courseId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateCourseDurationByCourseId(String courseId, int duration) 
	{
		int updatedRows = 0;
		try(Connection con = DataBaseUtil.establishConnection();)
		{
			
			/*--- creating reference of Prepared Statement interface ---*/
			PreparedStatement stmt = con.prepareStatement("update course set duration = ? where courseid = ?");
			/*--- setting values into the query parameters */
			stmt.setInt(1, duration);
			stmt.setString(2, courseId);
			/*-------------------------------------------------*/
			//executing the query
			updatedRows = stmt.executeUpdate();
		}
		catch(SQLException sqe)
		{
			System.out.println(sqe);
		}
		return updatedRows;
	}

	

}

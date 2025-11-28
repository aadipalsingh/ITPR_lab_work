package com.knmodicollege.collegemanagemet;

import com.knmodicollege.collegemanagemet.dao.CourseDAO;
import com.knmodicollege.collegemanagemet.dao.Impl.CourseDAOImpl;
import com.knmodicollege.collegemanagemet.models.course;
import com.knmodicollege.collegemanagemet.util.DataBaseUtil;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //to create tables if not exists
    	DataBaseUtil.createTables();
    	/*---- Creating course data ---*/
    	course courseData = new course("course107","Core Java", "programming in Java", 90, 20, 60);
    	CourseDAO cdi = new CourseDAOImpl();
    	
    	/*--- inserting course into the table -----*/
    	int rows = cdi.save(courseData);
    	if(rows > 0)
    	{
    		System.out.println("Data Inserted");
    	}
    	else
    	{
    		System.out.println("Unable to insert data");
    	}
    }
}

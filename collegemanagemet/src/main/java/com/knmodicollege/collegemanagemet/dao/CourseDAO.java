package com.knmodicollege.collegemanagemet.dao;
import com.knmodicollege.collegemanagemet.models.course;
import java.util.*;
/*-----this is DAO layer which will interact with database directly-----------------------*/

public interface CourseDAO {
	
	/*-------to insert the data into the table------------*/
	int save(course CourseData);
	//method for updating duartion
	int updatecourseDuration(String courseId,int duration);
	
	/*-------to fetch complete course list------------*/
	ArrayList<course> findAll();
	
	/*--- to fetch course details based on course id ----*/
	course findByCourseId(String courseId);
	
	/*---- to update Course Duration based on course id ---*/
	int updateCourseDurationByCourseId(String courseId, int duration);

}

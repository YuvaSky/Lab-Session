package com.college;

import java.util.List;

import com.dao.CourseDao;
import com.entity.Course;
import com.entity.CourseDetail;


public class App 
{
    public static void main( String[] args )
    {
        // Save two instructors
        Course course = new Course( "Sky","BCA", "sky22@gmail.com");
        CourseDetail courseDetail = new CourseDetail( "IT", "70000");
        courseDetail.setCourse(course);
        course.setCourseDetail(courseDetail);
       
        Course course1 = new Course("Yuva","B.Tech","yuva23@gmail.com");
        CourseDetail courseDetail1 = new CourseDetail( "CSE", "70000");
        courseDetail1.setCourse(course1);
        course1.setCourseDetail(courseDetail1);
       
        CourseDao courseDao = new CourseDao();
        courseDao.saveCourse(course);
        courseDao.saveCourse(course1);
       
        // Get all instructors
        List<Course> courses = courseDao.getAllCrouse();
        courses.forEach(courseTemp -> System.out.println(courseTemp.getName()));
    }
}


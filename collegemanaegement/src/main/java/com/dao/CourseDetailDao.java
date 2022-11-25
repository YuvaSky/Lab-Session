package com.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.entity.CourseDetail;
import com.util.HibernateUtil;


public class CourseDetailDao {
	    
	    /**
	     * Save Instructor
	     * @param instructor
	     */
	    public void saveCourseDetail(CourseDetail courseDetail) {
	        Transaction transaction = null;
	        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
	            // start a transaction
	            transaction = session.beginTransaction();
	            // save the student object
	            session.save(courseDetail);
	            // commit transaction
	            transaction.commit();
	        } catch (Exception e) {
	            if (transaction != null) {
	                transaction.rollback();
	            }
	            e.printStackTrace();
	        }
	    }

	 

	    /**
	     * Update Instructor
	     * @param instructor
	     */
	    public void updateCourseDetail(CourseDetail courseDetail) {
	        Transaction transaction = null;
	        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
	            // start a transaction
	            transaction = session.beginTransaction();
	            // save the student object
	            session.update(courseDetail);
	            // commit transaction
	            transaction.commit();
	        } catch (Exception e) {
	            if (transaction != null) {
	                transaction.rollback();
	            }
	            e.printStackTrace();
	        }
	    }


	    /**
	     * Get Instructor By ID
	     * @param id
	     * @return
	     */
	    public CourseDetail getCourseDetail(int id) {

	 

	        Transaction transaction = null;
	        CourseDetail course = null;
	        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
	            // start a transaction
	            transaction = session.beginTransaction();
	            // get an instructor object
	            course = session.get(CourseDetail.class, id);
	            // commit transaction
	            transaction.commit();
	        } catch (Exception e) {
	            if (transaction != null) {
	                transaction.rollback();
	            }
	            e.printStackTrace();
	        }
	        return course;
	    }



		}




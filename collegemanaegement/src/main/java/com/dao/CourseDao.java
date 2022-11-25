package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.entity.Course;
import com.util.HibernateUtil;


public class CourseDao {
	    
	    /**
	     * Save Instructor
	     * @param instructor
	     */
	    public void saveCourse(Course course) {
	        Transaction transaction = null;
	        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
	            // start a transaction
	            transaction = session.beginTransaction();
	            // save the student object
	            session.save(course);
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
	    public void updateCourse(Course course) {
	        Transaction transaction = null;
	        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
	            // start a transaction
	            transaction = session.beginTransaction();
	            // save the student object
	            session.update(course);
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
	     * Delete Instructor
	     * @param id
	     */
	    public void deleteCourse(int id) {

	 

	        Transaction transaction = null;
	        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
	            // start a transaction
	            transaction = session.beginTransaction();

	 

	            // Delete a instructor object
	            Course course = session.get(Course.class, id);
	            if (course != null) {
	                session.delete(course);
	                System.out.println("Course is deleted");
	            }

	 

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
	    public Course getCourse(int id) {

	 

	        Transaction transaction = null;
	        Course course = null;
	        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
	            // start a transaction
	            transaction = session.beginTransaction();
	            // get an instructor object
	            course = session.get(Course.class, id);
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
	    public List<Course> getAllCrouse() {

	    	 

	        Transaction transaction = null;
	        List<Course> listOfCourse = null;
	        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
	            // start a transaction
	            transaction = session.beginTransaction();
	            // get an instructor object
	            
	            listOfCourse = session.createQuery("from Course").getResultList();
	            
	            // commit transaction
	            transaction.commit();
	        } catch (Exception e) {
	            if (transaction != null) {
	                transaction.rollback();
	            }
	            e.printStackTrace();
	        }
			return listOfCourse;
	    }
	}



		
		

	


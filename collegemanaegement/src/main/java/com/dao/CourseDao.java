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
	    public void saveCrouse(Course course) {
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
	    public void updateInstructor(Course course) {
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
	    public void deleteInstructor(int id) {

	 

	        Transaction transaction = null;
	        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
	            // start a transaction
	            transaction = session.beginTransaction();

	 

	            // Delete a instructor object
	            Course course = session.get(Course.class, id);
	            if (course != null) {
	                session.delete(course);
	                System.out.println("course is deleted");
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
	    
	    /**
	     * Get all Instructors
	     * @return
	     */
	    @SuppressWarnings("unchecked")
	    public List<Course> getAllCourse() {

	 

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



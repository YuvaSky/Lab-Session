package com.junit;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import com.dao.CourseDetailDao;

public class Addmission {
	
	private CourseDetailDao fees;
	private double semfees;
	@BeforeEach
	void init(){
		fees = new CourseDetailDao();	
	}
	@Test
	void testfeesWithSemfees() {
		 
	 semfees = 65000;if(semfees>=65000) {
		assertThrows(IllegalArgumentException.class,() ->{
			equals(semfees);
			});
	}
	}
}
		
	


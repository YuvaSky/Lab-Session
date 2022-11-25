package com.junit;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import com.entity.CourseDetail;

public class Addmission {
	
	private CourseDetail semfees;
	@BeforeEach
	void init(){
		semfees = new CourseDetail();	
	}
	@Test
	void testfeesWithSemfees() {
		 
	double semfees=65000;if(semfees>=65000) {
		assertThrows(IllegalArgumentException.class,() ->{
			equals(semfees);
			});
	}
	}
}
		
	


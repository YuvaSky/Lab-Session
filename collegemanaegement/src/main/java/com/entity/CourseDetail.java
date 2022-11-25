package com.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "course_detail")
public class CourseDetail {
	
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)

//variables
@Column(name = "id")
private int id;

@Column(name = "Subject")
private String subject;

@Column(name = "fees")
private int fees;

@OneToOne(mappedBy="courseDetail", cascade=CascadeType.ALL)
private Course Course;

//default constructor
public CourseDetail() {
    
}

//Parameterized Constructor
public CourseDetail( String subject, String semester) {
	super();
	this.subject = subject;
	this.fees = fees;		
}

//getter & setter
public int getId() {
	return id;
}


public void setId(int id) {
	this.id = id;
}


public String getSubject() {
	return subject;
}


public void setSubject(String subject) {
	this.subject = subject;
}


public int getfees() {
	return fees;
}


public void setFees(int fees) {
	this.fees = fees;
	
}

public Course getCourse() {
	return Course;
}


public void setCourse(Course course) {
	Course = course;
}


@Override
public String toString() {
	return "CourseDetail [id=" + id + ", subject=" + subject + ", fees=" + fees + "]";
}


}

package com.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "course")
public class Course {
	
	//variables
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name= "name")
	private String name;
	
	@Column(name= "coursename")
	private String coursename;
	
	@Column(name= "email")
	private String email;
	
	@OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="course_detail_id")
    private CourseDetail courseDetail;
	
	//default constructor
    public Course() {
        
    }
	
  //parameterized constructor
	public Course(String name, String coursename, String email) {
		super();
		this.name = name;
		this.coursename = coursename;
		this.email = email;
	}
	
	//getter & Setter
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCoursename() {
		return coursename;
	}
	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public CourseDetail getCourseDetail() {
		return courseDetail;
	}

	public void setCourseDetail(CourseDetail courseDetail) {
		this.courseDetail = courseDetail;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", coursename=" + coursename + ", email=" + email
				+ ", courseDetail=" + courseDetail + "]";
	}
	
}

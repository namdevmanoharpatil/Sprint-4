package com.masai.Model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Teacher {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int teacherId;
	private String teacherName;
	private int noYearOfExperince;
	private String email;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "teacher")
	private List<Course> teacherCourseList = new ArrayList<Course>();

	@Override
	public String toString() {
		return "Teacher{" + "teacherId=" + teacherId + ", teacherName='" + teacherName + '\'' + ", noYearOfExperince="
				+ noYearOfExperince + ", email='" + email + '\'' + '}';
	}

	public int getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public int getNoYearOfExperince() {
		return noYearOfExperince;
	}

	public void setNoYearOfExperince(int noYearOfExperince) {
		this.noYearOfExperince = noYearOfExperince;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Course> getTeacherCourseList() {
		return teacherCourseList;
	}

	public void setTeacherCourseList(List<Course> teacherCourseList) {
		this.teacherCourseList = teacherCourseList;
	}
}
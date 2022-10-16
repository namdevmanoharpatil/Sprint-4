package com.masai.UseCase;

import com.masai.Dao.CourseDAO;
import com.masai.Dao.CourseDAOImpl;
import com.masai.Model.Course;

import java.util.Scanner;

public class AddCourse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CourseDAO dao = new CourseDAOImpl();
		System.out.println("Enter the course details");
		Course course = new Course();
		System.out.println("Enter the course Name:");
		course.setCourseName(sc.next());
		System.out.println("Enter the course Duration in months:");
		course.setDuration(sc.next());
		System.out.println("Enter the course Fee:");
		course.setFee(sc.nextInt());

		dao.addCourse(course);
	}
}
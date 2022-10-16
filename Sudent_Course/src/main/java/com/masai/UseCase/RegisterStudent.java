package com.masai.UseCase;

import com.masai.Dao.CourseDAO;
import com.masai.Dao.CourseDAOImpl;
import com.masai.Exceptions.CourseException;
import com.masai.Model.Student;

import java.util.Scanner;

public class RegisterStudent {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CourseDAO dao = new CourseDAOImpl();
		System.out.println("Enter the Student details");
		Student stu = new Student();
		System.out.println("Enter the Student Name");
		stu.setName(sc.next());
		System.out.println("Enter the Student mobile no.:");
		stu.setMobile(sc.next());
		System.out.println("Enter the Student email: ");
		stu.setEmail(sc.next());
		System.out.println("Enter the Course id:");
		int courseId = sc.nextInt();

		try {
			dao.registerStudent(stu, courseId);
		} catch (CourseException ce) {
			System.out.println(ce.getMessage());
		} finally {
			sc.close();
		}
	}
}
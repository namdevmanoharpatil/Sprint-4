package com.masai.UseCase;

import com.masai.Dao.CourseDAO;
import com.masai.Dao.CourseDAOImpl;
import com.masai.Exceptions.CourseException;
import com.masai.Exceptions.TeacherException;

import java.util.Scanner;

public class AssignTeacherWithCourse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CourseDAO dao = new CourseDAOImpl();
		System.out.println("Enter Teacher id:");
		int tid = sc.nextInt();
		System.out.println("Enter course id:");
		int cid = sc.nextInt();

		try {
			dao.assignTeacherWithCourse(tid, cid);
		} catch (TeacherException te) {
			System.out.println(te.getMessage());
		} catch (CourseException ce) {
			System.out.println(ce.getMessage());
		} finally {
			sc.close();
		}
	}
}
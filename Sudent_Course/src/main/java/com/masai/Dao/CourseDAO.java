package com.masai.Dao;

import com.masai.Exceptions.CourseException;
import com.masai.Exceptions.TeacherException;
import com.masai.Model.Course;
import com.masai.Model.Student;
import com.masai.Model.Teacher;

import java.util.List;

public interface CourseDAO {
	public void addCourse(Course course);

	public void registerStudent(Student student, int courseId) throws CourseException;

	public void registerTeacher(Teacher teacher);

	public void assignTeacherWithCourse(int teacherId, int courseId) throws TeacherException, CourseException;

	List<Student> getAlltheStudentsByCourseName(String courseName) throws CourseException;
}
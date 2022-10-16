package com.masai.Dao;

import com.masai.Exceptions.CourseException;
import com.masai.Exceptions.TeacherException;
import com.masai.Model.Course;
import com.masai.Model.Student;
import com.masai.Model.Teacher;
import com.masai.Utility.EMUtil;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

public class CourseDAOImpl implements CourseDAO {
	EntityManager em = EMUtil.provideEM();

	@Override
	public void addCourse(Course course) {

		em.getTransaction().begin();
		em.persist(course);
		em.getTransaction().commit();

		em.close();

		System.out.println("Course details inserted successfully!");
	}

	@Override
	public void registerStudent(Student student, int courseId) throws CourseException {
		Course courseObj = em.find(Course.class, courseId);

		if (courseObj == null)
			throw new CourseException("Invalid Course!");

		courseObj.getStudentList().add(student);
		student.getCourseList().add(courseObj);

		em.getTransaction().begin();
		em.persist(student);
		em.getTransaction().commit();

		em.close();

		System.out.println("Student registered successfully!");
	}

	@Override
	public void registerTeacher(Teacher teacher) {
		em.getTransaction().begin();
		em.persist(teacher);
		em.getTransaction().commit();

		em.close();

		System.out.println("Teacher details inserted successfully!");

	}

	@Override
	public void assignTeacherWithCourse(int teacherId, int courseId) throws TeacherException, CourseException {
		Course cour = em.find(Course.class, courseId);
		Teacher teachObj = em.find(Teacher.class, teacherId);

		if (cour == null)
			throw new CourseException("Course doesnt exist!");
		if (teachObj == null)
			throw new TeacherException("Teacher doesnt exist!");

		cour.setTeacher(teachObj);
		teachObj.getTeacherCourseList().add(cour);

		em.getTransaction().begin();
		em.persist(teachObj);
		em.getTransaction().commit();

		em.close();

		System.out.println("Teacher assigned to course successfully!");
	}

	@Override
	public List<Student> getAlltheStudentsByCourseName(String courseName) throws CourseException {
		List<Student> allstudent = null;

		String jpql = "select studentList from Course where courseName = ?1";

		Query q = em.createQuery(jpql);

		q.setParameter(1, courseName);

		allstudent = q.getResultList();

		if (allstudent.size() == 0)
			throw new CourseException("No employee found!");

		em.close();

		return allstudent;
	}
}
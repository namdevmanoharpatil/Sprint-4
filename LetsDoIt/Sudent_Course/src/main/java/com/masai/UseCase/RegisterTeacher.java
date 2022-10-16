package com.masai.UseCase;


import com.masai.Dao.CourseDAO;
import com.masai.Dao.CourseDAOImpl;
import com.masai.Model.Teacher;

import java.util.Scanner;

public class RegisterTeacher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CourseDAO dao = new CourseDAOImpl();
        System.out.println("Enter the Teacher details");
        Teacher teac = new Teacher();
        System.out.println("Enter the Teacher Name");
        teac.setTeacherName(sc.next());
        System.out.println("Enter the Teacher  Years of Experience:");
        teac.setNoYearOfExperince(sc.nextInt());
        System.out.println("Enter the Teacher email: ");
        teac.setEmail(sc.next());

        dao.registerTeacher(teac);
    }
}
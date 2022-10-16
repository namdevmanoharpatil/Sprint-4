package com.masai.UseCase;


import com.masai.Dao.CourseDAO;
import com.masai.Dao.CourseDAOImpl;
import com.masai.Exceptions.CourseException;
import com.masai.Model.Student;

import java.util.List;
import java.util.Scanner;

public class GetetAlltheStudentsByCourseName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CourseDAO dao = new CourseDAOImpl();
        System.out.println("Enter Course name:");
        String cname = sc.next();

        try {
            List<Student> sList =dao.getAlltheStudentsByCourseName(cname);
            for(Student s: sList) {
                System.out.println(s);
            }
        }catch(CourseException ce) {
            System.out.println(ce.getMessage());
        }finally {
            sc.close();
        }
    }
}
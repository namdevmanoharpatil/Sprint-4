package com.masai.UseCase;

import com.masai.Dao.EmpDAO;
import com.masai.Dao.EmpDAOImpl;
import com.masai.Exceptions.EmployeeException;
import com.masai.Model.Employee;

import java.util.List;
import java.util.Scanner;

public class GetAllEmployeeWithDeptName {
    public static void main(String[] args) {
        EmpDAO dao = new EmpDAOImpl();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Department Name: ");
        String deptName = sc.next();

        try {
            List<Employee> empList = dao.getAllEmployeeWithDeptName(deptName);
            for(Employee e: empList) {
                System.out.println(e);
            }
        }catch(
                EmployeeException ee) {
            System.out.println(ee.getMessage());
        }finally {
            sc.close();
        }
    }
    }

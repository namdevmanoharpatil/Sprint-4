package com.masai.UseCase;

import com.masai.Dao.EmpDAO;
import com.masai.Dao.EmpDAOImpl;
import com.masai.Exceptions.DepartmentException;
import com.masai.Exceptions.EmployeeException;

import java.util.Scanner;

public class RegisterEmployeeTODepartment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmpDAO dao = new EmpDAOImpl();
        System.out.println("Enter the Employee id: ");
        int empid = sc.nextInt();
        System.out.println("Enter the Department id: ");
        int deptid = sc.nextInt();

        try {
            dao.registerEmployeeTODepartment(empid, deptid);


        }catch(EmployeeException ee) {
            System.out.println(ee.getMessage());
        }catch(DepartmentException de) {
            System.out.println(de.getMessage());
        }finally {
            sc.close();
        }
    }
}
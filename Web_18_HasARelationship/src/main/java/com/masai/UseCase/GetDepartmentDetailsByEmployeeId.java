package com.masai.UseCase;

import com.masai.Dao.EmpDAO;
import com.masai.Dao.EmpDAOImpl;
import com.masai.Exceptions.DepartmentException;
import com.masai.Model.Department;

import java.util.Scanner;

public class GetDepartmentDetailsByEmployeeId {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmpDAO dao = new EmpDAOImpl();
        System.out.println("Enter the Employee id: ");
        int empId = sc.nextInt();

        try {
            Department dpt = dao.getDepartmentDetailsByEmployeeId(empId);
            System.out.println(dpt);
        }catch(DepartmentException de) {
            System.out.println(de.getMessage());
        }finally {
            sc.close();
        }
    }
}

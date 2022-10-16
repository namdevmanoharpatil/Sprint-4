package com.masai.useCase;

import com.masai.EmployeeDAO.EmpDAO;
import com.masai.EmployeeDAO.EmpDAOImpl;
import com.masai.Model.ConractualEmployee;
import com.masai.Model.SalariedEmployee;

import java.util.List;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmpDAO empDAO = new EmpDAOImpl();
        for (int i = 1; i <= 4; i++) {
            SalariedEmployee emp = new SalariedEmployee();
            System.out.println("Enter employee Name:");
            emp.setEmpName(sc.next());
            System.out.println("Enter salary: ");
            emp.setSalary(sc.nextInt());
            System.out.println("Enter email: ");
            emp.setEmail(sc.next());

            empDAO.SaveSalariedEmployees(emp);
        }
        List<SalariedEmployee> salariedEmployeeList = empDAO.getallSalariedEmployeedetails();
        for (SalariedEmployee acc : salariedEmployeeList) {
            System.out.println(acc);
        }
    }
    }

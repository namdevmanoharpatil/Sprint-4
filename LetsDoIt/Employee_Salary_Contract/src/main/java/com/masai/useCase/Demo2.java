package com.masai.useCase;

import com.masai.EmployeeDAO.EmpDAO;
import com.masai.EmployeeDAO.EmpDAOImpl;
import com.masai.Model.ConractualEmployee;

import java.util.List;
import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        EmpDAO empDAO =new EmpDAOImpl();
        Scanner sc=new Scanner(System.in);
        for(int i=1;i<=4;i++)
        {
            ConractualEmployee emp = new ConractualEmployee();
            System.out.println("Enter employee Name:");
            emp.setEmpName(sc.next());
            sc.nextLine();
            System.out.println("Enter No. of working days: ");
            emp.setNoOfWorkingDays(sc.nextInt());
            System.out.println("Enter Cost per day: ");
            emp.setCostofperday(sc.nextInt());
            System.out.println("Enter mobile:");
            sc.nextLine();
            emp.setMobileNumber(sc.next());
            empDAO.SaveContratualEmployees(emp);
        }
        List<ConractualEmployee> conractualEmployeeList=empDAO.getallContractualEmployee();
        for(ConractualEmployee cel:conractualEmployeeList){
            System.out.println(cel);
        }
        System.out.println("Done...");
    }
    }

package com.masai.UseCase;

import com.masai.Dao.EmpDAO;
import com.masai.Dao.EmpDAOImpl;
import com.masai.Model.Address;
import com.masai.Model.Employee;

import java.util.Scanner;

public class AddEmployee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Employee Details...");
        EmpDAO dao = new EmpDAOImpl();

        Employee emp = new Employee();
        System.out.println("Enter the Employee name: ");
        emp.setEname(sc.next());
        System.out.println("Enter the Employee salary: ");
        emp.setSalary(sc.nextInt());

        Address addr = new Address();
        System.out.println("Enter state:");
        addr.setState(sc.next());
        System.out.println("Enter city:");
        addr.setCity(sc.next());
        System.out.println("Enter pincode:");
        addr.setPincode(sc.next());


        emp.setAddr(addr);

        dao.addEmployee(emp);;
    }
}

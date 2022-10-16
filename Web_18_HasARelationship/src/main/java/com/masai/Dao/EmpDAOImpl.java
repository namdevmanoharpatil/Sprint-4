package com.masai.Dao;

import com.masai.Exceptions.DepartmentException;
import com.masai.Exceptions.EmployeeException;
import com.masai.Model.Department;
import com.masai.Model.Employee;
import com.masai.Utility.EMUtil;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

public class EmpDAOImpl implements EmpDAO{
    EntityManager em = EMUtil.provideEM() ;
    @Override
    public void addDepartment(Department dept) {

        if(dept != null) {
            em.getTransaction().begin();

            em.persist(dept);

            em.getTransaction().commit();
            System.out.println("Department saved");
        }


        em.close();
    }

    @Override
    public void addEmployee(Employee emp) {


        if(emp != null) {
            em.getTransaction().begin();

            em.persist(emp);

            em.getTransaction().commit();
            System.out.println("Employee saved");
        }


        em.close();
    }

    @Override
    public void registerEmployeeTODepartment(int empId, int deptId) throws EmployeeException, DepartmentException {
        Employee employee = em.find(Employee.class, empId);
        Department department = em.find(Department.class, deptId);
        System.out.println(department);
        System.out.println(employee);
         if(department==null){
             throw new DepartmentException("Department does not Exist");
         }
         if(employee==null){
             throw new EmployeeException("Employee doesn't exist");
         }
         else{
             employee.setDepartment(department);
             department.getEmployeeSet().add(employee);
             em.getTransaction().begin();

            Department department1=  em.merge(department);

             em.getTransaction().commit();
             em.close();
             System.out.println(department1);
             System.out.println("done...");

         }
    }

    @Override
    public List<Employee> getAllEmployeeWithDeptName(String deptName) throws EmployeeException {
        List<Employee> allemps = null;

        String jpql = "select employeeSet from Department where name = ?1";

        Query q = em.createQuery(jpql);

        q.setParameter(1, deptName);

        allemps= q.getResultList();

        if (allemps.size()==0) throw new EmployeeException("No employee found!");



        em.close();

        if (allemps.isEmpty()) throw new EmployeeException("No employee found!");

        return allemps;
    }

    @Override
    public Department getDepartmentDetailsByEmployeeId(int empId) throws DepartmentException {

        Employee emp = em.find(Employee.class, empId);

       Department dept = emp.getDepartment();

        em.close();

        if(dept == null ) throw new DepartmentException("No departement found!");

        return dept;
    }
}
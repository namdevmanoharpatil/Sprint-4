package com.masai.Dao;
import com.masai.Exceptions.DepartmentException;
import com.masai.Exceptions.EmployeeException;
import com.masai.Model.Department;
import com.masai.Model.Employee;

import java.util.List;

public interface EmpDAO {
	
	public void addDepartment(Department dept);

	public void addEmployee(Employee emp);

	public void registerEmployeeTODepartment(int empId, int deptId) throws EmployeeException, DepartmentException;

	List<Employee> getAllEmployeeWithDeptName(String deptName) throws EmployeeException;

	Department getDepartmentDetailsByEmployeeId(int empId) throws DepartmentException;
	
}
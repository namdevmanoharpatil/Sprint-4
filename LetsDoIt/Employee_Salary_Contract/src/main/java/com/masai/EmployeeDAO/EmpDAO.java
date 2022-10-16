package com.masai.EmployeeDAO;

import com.masai.Model.ConractualEmployee;
import com.masai.Model.SalariedEmployee;

import java.util.List;

public interface EmpDAO {
	void SaveContratualEmployees(ConractualEmployee conractualEmployee);

	void SaveSalariedEmployees(SalariedEmployee salariedEmployee);

	List<SalariedEmployee> getallSalariedEmployeedetails();

	List<ConractualEmployee> getallContractualEmployee();
}

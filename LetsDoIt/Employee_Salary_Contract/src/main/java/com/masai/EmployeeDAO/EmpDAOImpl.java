package com.masai.EmployeeDAO;

import com.masai.Model.ConractualEmployee;
import com.masai.Model.SalariedEmployee;
import com.masai.utility.EMUtil;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

public class EmpDAOImpl implements EmpDAO {
	EntityManager em = EMUtil.provideEM();

	@Override
	public void SaveContratualEmployees(ConractualEmployee conractualEmployee) {
		em.getTransaction().begin();

		em.persist(conractualEmployee);

		em.getTransaction().commit();

		System.out.println("done");
	}

	@Override
	public void SaveSalariedEmployees(SalariedEmployee salariedEmployee) {
		em.getTransaction().begin();

		em.persist(salariedEmployee);

		em.getTransaction().commit();

		System.out.println("done");
	}

	@Override
	public List<SalariedEmployee> getallSalariedEmployeedetails() {
		String jpql = "from SalariedEmployee";
		Query q = em.createQuery(jpql);

		List<SalariedEmployee> list = q.getResultList();
		em.close();
		return list;
	}

	@Override
	public List<ConractualEmployee> getallContractualEmployee() {
		String jpql = "from ConractualEmployee";
		Query q = em.createQuery(jpql);

		List<ConractualEmployee> list = q.getResultList();
		em.close();
		return list;
	}

}
package com.masai.Utility;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EMUtil {
	private static EntityManagerFactory emf;

	static {
		emf = Persistence.createEntityManagerFactory("BI-mapping2-units");
	}

	public static EntityManager provideEM() {
		return emf.createEntityManager();
	}
}

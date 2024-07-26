package com.asc.Util;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class EntityUtil {
	public static EntityManager getEntityManager() {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("MidTerm");
	EntityManager em = emf.createEntityManager();
	return em;
	}
}

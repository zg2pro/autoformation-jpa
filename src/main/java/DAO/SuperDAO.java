package main.java.DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class SuperDAO {

	protected static EntityManagerFactory emf = Persistence.createEntityManagerFactory("sample");
	protected static EntityManager em = emf.createEntityManager();
	/*
	public SuperDAO(){
		
	}
	*/
	
	
	
}

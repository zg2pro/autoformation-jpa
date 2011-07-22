package main.java.DAO;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import main.java.BO.BOAllowances;
import main.java.BO.BOCotisations;
import main.java.BO.BOEmployee;

public class initDB {

	private static EntityManager em;
	private static EntityManagerFactory emf;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Object> obj = new ArrayList<Object>();
		
		BOAllowances boa1 = new BOAllowances((float)5, 0, 0, 8);
		BOAllowances boa2 = new BOAllowances((float)1.93, 2, 3, 12);
		BOAllowances boa3 = new BOAllowances((float)2.1,(float)2.1,(float)3.1, 15);
		obj.add(boa1 );
		obj.add( boa2);
		obj.add( boa3);
		obj.add( new BOEmployee(Long.parseLong("183090602903306"), "Gregory", "Anne", 
				"19A Ho Bieu Chanh", "TP Ho Chi Minh", 70000, boa1));
		obj.add(  new BOEmployee(Long.parseLong("26012440211742"), "Justine", "Laverti", 
				"La Brulerie", "St Marcel", 49014, boa2));
		obj.add(  new BOEmployee(Long.parseLong("254104940426058"), "Marie", "Jouveinal", 
				"5 rue des oiseaux", "St Corentin", 49203, boa3));
		obj.add(  new BOCotisations((float)3.49, (float)6.15, (float)9.39, (float)7.88));

		emf = Persistence.createEntityManagerFactory("sample");
		em = emf.createEntityManager();
		 EntityTransaction transac = em.getTransaction();
		 transac.begin();
		
		for (Object o : obj)  em.persist(o);

		  transac.commit(); 
		em.close();
		emf.close();
		
	}

}

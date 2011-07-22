package main.java.DAO.structures;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import main.java.BO.BOCotisations;
import main.java.DAO.Connector;
import main.java.DAO.SuperDAO;

public class DAOCotisations extends SuperDAO {
	

	public static BOCotisations getCotisations() throws SQLException{
		BOCotisations boe = em.find(BOCotisations.class, 1);
		return boe;
	}
	
}

package main.java.DAO.structures;

import java.util.Collection;

import javax.persistence.Query;
import javax.persistence.Table;

import main.java.BO.BOEmployee;
import main.java.DAO.SuperDAO;

public class DAOEmployee extends SuperDAO {
/*
	public static BOEmployee getEmployee (long SS) throws SQLException{
		String query = "SELECT * FROM employees, allowances" +
		" WHERE SS = "+SS+" AND employees.index = allowances.index";
		ResultSet rs = Connector.select (query);
		rs.next();
		
		BOAllowances boa = new BOAllowances(rs.getInt("index"), 
				rs.getFloat("base_time"), rs.getFloat("keep_up_day"), 
				rs.getFloat("meal_day"), rs.getFloat("allowance_scp"));
				
		BOEmployee boe = null;
		new BOEmployee(SS, 
				rs.getString("first_name"), rs.getString("last_name"), 
				rs.getString("address"), rs.getString("city"), 
				rs.getInt("zip_code"), boa);
				
		return boe;
	}
	
	public static List<BOEmployee> getList () throws SQLException{
		String query = "SELECT * FROM employees, allowances" +
		" WHERE employees.index = allowances.index";
		ResultSet rs = Connector.select (query);
		List<BOEmployee> l = new ArrayList<BOEmployee>();
		while (rs.next()){
			BOAllowances boa = null;
			BOEmployee boe = new BOEmployee(rs.getLong("SS"), 
					rs.getString("first_name"), rs.getString("last_name"), 
					rs.getString("address"), rs.getString("city"), 
					rs.getInt("zip_code"), boa);
			l.add(boe);
		}
		return l;
	}
	*/
	
	public  static BOEmployee getEmployee (long SS) {
		BOEmployee boe = em.find(BOEmployee.class, SS);
		return boe;
	}
	
	@SuppressWarnings("unchecked")
	public static Collection<BOEmployee> getList (){
		Query query = em.createQuery("SELECT e FROM BOEmployee e");
	    return (Collection<BOEmployee>) query.getResultList();
	}
	
}

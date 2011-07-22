package main.java.jsf;

import java.sql.SQLException;

import main.java.BO.BOCotisations;
import main.java.BO.BOEmployee;
import main.java.DAO.structures.DAOCotisations;
import main.java.DAO.structures.DAOEmployee;

public class App {
	
	public static int EXIT = 0;
   
	public static void main( String[] args ) throws SQLException{
		String errorMessage = "Syntaxe : pg num_securite_sociale nb_heures_travaillees nb_jours_travailles";
		long ss = 0;
		int hours = 0, days = 0;
		
        try {
        	ss = Long.parseLong(args[0]);
        	hours = Integer.parseInt(args[1]);
        	days = Integer.parseInt(args[2]);
        } catch (Exception e){
        	System.out.println(errorMessage);
        	System.exit(0);
        }
        
        BOEmployee boe = DAOEmployee.getEmployee(ss);
        BOCotisations boc = DAOCotisations.getCotisations();
        
        float baseSalary = hours * boe.getIndex().getBaseTime();
        float socialCotisations = (boc.getRETRAITE() + boc.getSECU() + boc.getCSGD() + boc.getCSGRDS()) * baseSalary / 100;
        float keepUpAllowance = boe.getIndex().getKeepUpDay() * days;
        float mealAllowance = boe.getIndex().getMealDay() * days;
        float netSalary = baseSalary + keepUpAllowance + mealAllowance - socialCotisations;
        
        System.out.println("Valeurs saisies : \n"+
        	" N° de sécurité sociale de l'employé : "+ss+" \n"+
        	" Nombre d'heures travaillées : "+hours+" \n"+
        	" Nombre de jours travaillés : "+days+" \n"+
        	" Informations Employé : \n"+
        	" Nom : "+boe.getLastName()+" \n"+
        	" Prénom : "+boe.getFirstName()+" \n"+
        	" Adresse : "+boe.getAddress()+" \n"+
        	" Ville : "+boe.getCity()+" \n"+
        	" Code Postal : "+boe.getZipCode()+" \n"+
        	" Indice : "+boe.getIndex().getIndex()+" \n"+
        	" \n"+
        	" Informations Cotisations : \n"+
        	" CSGRDS : "+boc.getCSGRDS()+" % \n"+
        	" CSGD : "+boc.getCSGD()+" % \n"+
        	" Retraite : "+boc.getRETRAITE()+" % \n"+
        	" Sécurité sociale : "+boc.getSECU()+" % \n"+
        	" \n"+
        	" Informations Indemnités : \n"+
        	" Salaire horaire : "+boe.getIndex().getBaseTime()+" euro \n"+
        	" Entretien/jour : "+boe.getIndex().getKeepUpDay()+" euro \n"+
        	" Repas/jour : "+boe.getIndex().getMealDay()+" euro \n"+
        	" Congés Payés : "+boe.getIndex().getAllowanceScp()+" % \n"+
        	" \n"+
        	" Informations Salaire : \n"+
        	" Salaire de base : "+baseSalary+" euro \n"+
        	" Cotisations sociales : "+socialCotisations+" euro \n"+
        	" Indemnités d'entretien : "+keepUpAllowance+" euro \n"+
        	" Indemnités de repas : "+mealAllowance+" euro \n"+
        	" Salaire net : "+netSalary+" euro");
        
        EXIT = 1;
    }
    
}

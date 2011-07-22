package main.java.BO;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table (name="cotisations")
public class BOCotisations implements Serializable {

	@Id @GeneratedValue(strategy=GenerationType.AUTO) @Column(name = "ID") 
	private int id;
	
	@Column(name = "CSGRDS", precision=10, scale=4)
	private float CSGRDS;
	
	@Column(name = "CSGD", precision=10, scale=4)
	private float CSGD;
	
	@Column(name = "SECU", precision=10, scale=4)
	private float SECU;
	
	@Column(name = "RETRAITE", precision=10, scale=4)
	private float RETRAITE;

	public float getCSGRDS() {
		return CSGRDS;
	}

	public void setCSGRDS(float cSGRDS) {
		CSGRDS = cSGRDS;
	}

	public float getCSGD() {
		return CSGD;
	}

	public void setCSGD(float cSGD) {
		CSGD = cSGD;
	}

	public float getSECU() {
		return SECU;
	}

	public void setSECU(float sECU) {
		SECU = sECU;
	}

	public float getRETRAITE() {
		return RETRAITE;
	}

	public void setRETRAITE(float rETRAITE) {
		RETRAITE = rETRAITE;
	}

	public int getId() {
		return id;
	}

	public BOCotisations() {
		super();
	}

	public BOCotisations(float cSGRDS, float cSGD, float sECU, float rETRAITE) {
		super();
		CSGRDS = cSGRDS;
		CSGD = cSGD;
		SECU = sECU;
		RETRAITE = rETRAITE;
	}

	
	
	
}

package main.java.BO;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="allowances")
public class BOAllowances implements Serializable {

	@Id @GeneratedValue(strategy=GenerationType.AUTO) @Column(name = "ID") 
	private int index;
	
	@Column(name = "base_time", precision=10, scale=4)
	private float baseTime;

	@Column(name = "keep_up_day", precision=10, scale=4)
	private float keepUpDay;


	@Column(name = "meal_day", precision=10, scale=4)
	private float mealDay;


	@Column(name = "allowance_scp", precision=10, scale=4)
	private float allowanceScp;

	 @OneToMany(mappedBy="index")
	 private List<BOEmployee> employees;

	
	public BOAllowances(float baseTime, float keepUpDay, float mealDay, float allowanceScp) {
		this.baseTime = baseTime;
		this.allowanceScp = allowanceScp;
		this.mealDay = mealDay;
		this.keepUpDay = keepUpDay;
	}


	public float getBaseTime() {
		return baseTime;
	}


	public void setBaseTime(float baseTime) {
		this.baseTime = baseTime;
	}


	public float getKeepUpDay() {
		return keepUpDay;
	}


	public void setKeepUpDay(float keepUpDay) {
		this.keepUpDay = keepUpDay;
	}


	public float getMealDay() {
		return mealDay;
	}


	public void setMealDay(float mealDay) {
		this.mealDay = mealDay;
	}


	public float getAllowanceScp() {
		return allowanceScp;
	}


	public void setAllowanceScp(float allowanceScp) {
		this.allowanceScp = allowanceScp;
	}


	public int getIndex() {
		return index;
	}

	@Override
	public boolean equals(Object obj) {
		BOAllowances boa = (BOAllowances) obj;
		return (this.baseTime == boa.baseTime &&
		this.allowanceScp == boa.allowanceScp &&
		this.mealDay == boa.mealDay &&
		this.keepUpDay == boa.keepUpDay &&
		this.index == boa.index)? true : false;
	}

	@Override
	public String toString() {
		return this.baseTime+" "+this.allowanceScp
+" "+this.mealDay+" "+this.keepUpDay;
	}


	public BOAllowances() {
		super();
	}
	
	
	
}

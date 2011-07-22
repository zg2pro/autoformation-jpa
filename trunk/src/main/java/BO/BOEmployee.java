package main.java.BO;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="employees")
public class BOEmployee implements Serializable {
	
	@Id 
	@Column(name = "SS") 
	long SS;
	
	@Column(name = "first_name", length=20)
	private String firstName;
	
	@Column(name = "last_name", length=20)
	private String lastName;
	
	@Column(name = "address", length=20)
	private String address;
	
	@Column(name = "city", length=20)
	private String city;
	
	@Column (name = "zip_code")
	private int zipCode;
	
	
	  @ManyToOne(fetch=FetchType.LAZY)
	  @JoinColumn(name="boa_id")
	  private BOAllowances index;

	
	public BOEmployee(long SS, String firstName, String lastName,
			String address, String city, int zipCode, BOAllowances index) {
		this.SS = SS;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.zipCode = zipCode;
		this.index = index;
	}

	@Override
	public String toString() {
		return (firstName + " " + lastName);
	}

	public long getSS() {
		return SS;
	}

	public void setSS(long sS) {
		SS = sS;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getZipCode() {
		return zipCode;
	}

	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}

	public void setIndex(BOAllowances index) {
		this.index = index;
	}
	
	public BOAllowances getIndex(){
		return index;
	}

	public BOEmployee() {
		super();
	}

	
}

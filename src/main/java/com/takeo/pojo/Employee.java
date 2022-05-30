package com.takeo.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;



@Entity
@Table(name = "EMPLOYEE")

//Dynamic NamedHqlQueries
//@NamedQuery(name = "find.all", query = "from Employee")
//@NamedQuery(name = "find.all", query = "from Employee where eno > 100")

//with named parameter
@NamedQuery(name = "find.all", query = "from Employee where eno >:no")
public class Employee {
	
	@Id
	@Column(name = "ENO")
	private int eno;
	
	@Column(name = "FIRSTNAME")
	private String firstName;
	
	@Column(name = "LASTNAME")
	private String lastName;
	
	@Column(name = "EMAIL")
	private String email;
	
	
	public Employee(int eno, String firstName, String lastName, String email) {
		super();
		this.eno = eno;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	

}

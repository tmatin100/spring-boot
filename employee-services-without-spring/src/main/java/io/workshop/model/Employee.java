package io.workshop.model;

import java.util.Date;

public class Employee {
	
	private Integer  id;
	private String name;
	private Date birthDate;
	
	public Employee() {
		super(); // invoking Object()
	}
	
	

	public Employee(Integer id, String name, Date birthDate) {
		this();
		this.id = id;
		this.name = name;
		this.birthDate = birthDate;
	}



	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}



	@Override
	public String toString() {
		return String.format("Employee [id=%s, name=%s, birthDate=%s]", id, name, birthDate);
	}
	
	
	

}

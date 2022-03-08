package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
class Employee {
	@Id 
	@GeneratedValue (strategy = GenerationType.AUTO)
	private int id;
	private String name;
	

	Employee() {
	}

	Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return this.id;
	}

	public String getName() {
		return this.name;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee - id=" + this.id + ", name=" + this.name;
	}

}
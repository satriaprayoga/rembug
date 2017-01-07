package com.rembug.domain;

import java.io.Serializable;

public class BudgetItem implements Serializable{

	private static final long serialVersionUID = 6474454613822077479L;

	private Long id;
	
	private String name;
	
	private Double value;
	
	private Budget budget;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}
	
	public void setBudget(Budget budget) {
		this.budget = budget;
	}
	
	public Budget getBudget() {
		return budget;
	}
	
	
}

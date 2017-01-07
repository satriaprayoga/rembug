package com.rembug.domain;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class Budget implements Serializable{

	private static final long serialVersionUID = 3964869804830021979L;
	
	private Long id;
	
	private Double value;
	
	private Double current=0.0;
	
	private Double remaining=0.0;
	
	private Project project;
	
	private Set<BudgetItem> budgetItems=new HashSet<>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}
	
	public void setCurrent(Double current) {
		this.current = current;
	}
	
	public Double getCurrent() {
		return current;
	}
	
	public void setRemaining(Double remaining) {
		this.remaining = remaining;
	}
	
	public Double getRemaining() {
		return remaining;
	}
	
	public void setBudgetItems(Set<BudgetItem> budgetItems) {
		this.budgetItems = budgetItems;
	}
	
	public Set<BudgetItem> getBudgetItems() {
		return budgetItems;
	}
	

}

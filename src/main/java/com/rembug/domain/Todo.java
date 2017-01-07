package com.rembug.domain;

import java.io.Serializable;
import java.time.LocalDate;

public class Todo implements Serializable{

	private static final long serialVersionUID = 441773154909788775L;

	private Long id;
	
	private String code;
	
	private String name;
	
	private String description;
	
	private LocalDate start;
	
	private LocalDate finish;
	
	private Project project;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDate getStart() {
		return start;
	}

	public void setStart(LocalDate start) {
		this.start = start;
	}

	public LocalDate getFinish() {
		return finish;
	}

	public void setFinish(LocalDate finish) {
		this.finish = finish;
	}
	
	public void setProject(Project project) {
		this.project = project;
	}
	
	public Project getProject() {
		return project;
	}
	
	
}

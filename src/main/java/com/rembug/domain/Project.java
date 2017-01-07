package com.rembug.domain;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class Project implements Serializable {

	private static final long serialVersionUID = 7078932220945173966L;
	
	private Long id;
	
	private String code;
	
	private String name;
	
	private String description;
	
	private LocalDate start;
	
	private LocalDate finish;
	
	private boolean active=true;
	
	private Set<Todo> todos=new HashSet<Todo>();

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
	
	public void setTodos(Set<Todo> todos) {
		this.todos = todos;
	}
	
	public Set<Todo> getTodos() {
		return todos;
	}
	
	public void setActive(boolean active) {
		this.active = active;
	}
	
	public boolean isActive() {
		return active;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Project other = (Project) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Project {id=" + id + ", code=" + code + ", name=" + name + ", description=" + description + ", start="
				+ start + ", finish=" + finish + "}";
	}
	
	

}

package com.rembug.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Table(name="auth")
@Cache(usage=CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class Authority implements Serializable {

	private static final long serialVersionUID = -4198959137999859682L;

	@NotNull
	@Size(min = 0, max = 50)
	@Id
	@Column(length = 50)
	private String name;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public int hashCode() {
		return name != null ? name.hashCode() : 0;
	}

	@Override
	public String toString() {
		return "Authority{" + "name='" + name + '\'' + "}";
	}
}

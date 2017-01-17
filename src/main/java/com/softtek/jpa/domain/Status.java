package com.softtek.jpa.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "status")
public class Status implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	
	@Id
	@Column(name = "status_id")
	private Long id;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "status_type")
	private String type;

	
	
	
	public Status() {
		super();
	}
	

	public Status(Long id, String description) {
		super();
		this.id = id;
		this.description = description;
	}


	public Status(Long id, String description, String type) {
		this.id = id;
		this.description = description;
		this.type = type;
	}
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
	@Override
	public String toString() {
		return "Status [id=" + id + ", description=" + description + ", type=" + type + "]";
	}	
}

package com.softtek.jpa.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user_role")
public class UserRole implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "user_role_id")
	private String user_roleid;

	@Column(name = "description")
	private String description;
	
	public UserRole(){
		
	}
	
	
	public UserRole(String user_roleid) {
		super();
		this.user_roleid = user_roleid;
	}


	public UserRole(String user_roleid, String description) {
		super();
		this.user_roleid = user_roleid;
		this.description = description;
	}

	public String getUser_roleid() {
		return user_roleid;
	}

	public void setUser_roleid(String user_roleid) {
		this.user_roleid = user_roleid;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	

	

}

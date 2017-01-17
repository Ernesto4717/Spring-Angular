package com.softtek.jpa.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.ColumnResult;
import javax.persistence.ConstructorResult;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.SqlResultSetMapping;
import javax.persistence.SqlResultSetMappings;
import javax.persistence.Table;

@Entity
@Table(name = "user")
@NamedNativeQueries({
	@NamedNativeQuery(
			name="findUsers",
			query="SELECT u.username as username, "
					+ "u.password as password,"
					+ "u.name as name, "
					+ "u.user_role_id as userRoleId, "
					+ "u.active as active, " 
					+ "ur.description  "
					+" FROM user u "
			+ "   JOIN user_role  ur   ON ur.user_role_id = u.user_role_id",
			resultSetMapping = "UsersMapping"),
	
	@NamedNativeQuery(
			name="findOneUser",
				query="SELECT u.username as username, "
						+ "u.password as password,"
						+ "u.name as name, "
						+ "u.user_role_id as userRoleId, "
						+ "u.active as active, " 
						+ "ur.description as description "
						+ " FROM user u "
				+ " JOIN user_role ur ON ur.user_role_id = u.user_role_id"
				+ " WHERE u.username = :username",
				resultSetMapping = "UserMapping"),
	@NamedNativeQuery(
			name="update",
				query="UPDATE user u , "
						+ "SET "
						+ "u.password = :password,"
						+ "u.name= :name,"
						+ "u.active= :active,"
						+ "u.user_role_id=(SELECT user_role_id FROM user_role  WHERE user_role_id = :id)"
				
				+ " WHERE u.username= :oldusername",
				resultSetMapping = "updateResult")
	})
@SqlResultSetMappings({
	@SqlResultSetMapping(name="UsersMapping",
			classes= {
					@ConstructorResult(
							targetClass = User.class,
							columns = {
								@ColumnResult(name = "username", type = String.class),
								@ColumnResult(name = "password", type = String.class),
								@ColumnResult(name = "name", type = String.class),
								@ColumnResult(name = "userRoleId", type = String.class),
								@ColumnResult(name = "active", type = String.class),
								@ColumnResult(name = "description", type = String.class)
							})
			}),
	@SqlResultSetMapping(name="UserMapping",
	classes= {
			@ConstructorResult(
					targetClass = User.class,
					columns = {
						@ColumnResult(name = "username", type = String.class),
						@ColumnResult(name = "password", type = String.class),
						@ColumnResult(name = "name", type = String.class),
						@ColumnResult(name = "userRoleId", type = String.class),
						@ColumnResult(name = "active", type = String.class),
						@ColumnResult(name = "description", type = String.class)
					})
	}),
	@SqlResultSetMapping(name="updateResult", columns = { @ColumnResult(name = "count")})
})


public class User implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "username")
	private String username;
	
	@Column(name = "name")
	private String name;
	
	@ManyToOne
	@JoinColumn(name = "user_role_id")
	private  UserRole role;
	
	@Column(name = "active")
	private String status;
	
	@Column(name = "password")
	private String password;
	
	
	
	
	
	public User() {
		super();
	}


	public User(final String username, final String password, final String name,final String userRoleId , final String status,final String description) {
		super();
		this.username = username;
		this.name = name;
		this.status = status;
		this.password = password;
		this.role = new UserRole(userRoleId, description);
	
	}


	public String getUsername() {
		return username;
	}
	
	
	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public void setUsername(String userName) {
		this.username = userName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public UserRole getRole() {
		return role;
	}
	public void setRole(UserRole role) {
		this.role = role;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "User [userName=" + username + ", name=" + name + ", role=" + role + ", status=" + status + "]";
	}
	

	
	
}

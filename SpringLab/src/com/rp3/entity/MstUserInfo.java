package com.rp3.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="MstUserInfo")
public class MstUserInfo {

	@Id
    @Column(name="ID")
    @GeneratedValue
    private Integer id;

	@Column(name="UserID")
    private String userId;

    @Column(name="FirstName")
    private String firstName;
 
    @Column(name="LastName")
    private String lastName;
    
    @Column(name="Password")
    private String password;

	
    public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}

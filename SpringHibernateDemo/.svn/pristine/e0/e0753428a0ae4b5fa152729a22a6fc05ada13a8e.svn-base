package com.tgb.entity;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

public class LoginUser {

	@NotNull(message="{userName.not.empty}")
	@Length(min=1,message="{userName.not.empty}")
	private String username ;
	
	@NotNull(message="{password.not.empty}")
	@Length(min=1,message="{password.not.empty}")
	private String password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}

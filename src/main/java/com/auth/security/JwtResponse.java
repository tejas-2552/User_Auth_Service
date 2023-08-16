package com.auth.security;

public class JwtResponse {

	private String token;
	
	private String username;

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public JwtResponse(String token, String username) {
		super();
		this.token = token;
		this.username = username;
	}

	
	
	
	
}

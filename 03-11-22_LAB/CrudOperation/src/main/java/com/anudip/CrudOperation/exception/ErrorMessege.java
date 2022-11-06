package com.anudip.CrudOperation.exception;

import org.springframework.http.HttpStatus;

public class ErrorMessege 
{
	
	private HttpStatus status;
	private String messege;
	
	public ErrorMessege(HttpStatus status, String messege) {
		super();
		this.status = status;
		this.messege = messege;
	}
	public HttpStatus getStatus() {
		return status;
	}
	public void setStatus(HttpStatus status) {
		this.status = status;
	}
	public String getMessege() {
		return messege;
	}
	public void setMessage(String messege) {
		this.messege = messege;
	}

}

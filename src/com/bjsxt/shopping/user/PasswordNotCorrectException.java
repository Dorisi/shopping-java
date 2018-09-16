package com.bjsxt.shopping.user;

@SuppressWarnings("serial")
public class PasswordNotCorrectException extends RuntimeException {

	public PasswordNotCorrectException(String message) {
		super(message);
	}
	
}

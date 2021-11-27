package com.bridgelabz.UserRegistation_LAMBDA;

public class UserValidationException extends Exception {
	String message;

	public UserValidationException(String message) {
		this.message = message;
	}
}
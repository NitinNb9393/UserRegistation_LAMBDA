package com.bridgelabz.UserRegistation_LAMBDA;

@FunctionalInterface
public interface UserValidate<T> {
	boolean validate(T param);
}
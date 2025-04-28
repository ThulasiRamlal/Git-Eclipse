package com.customexception;

public class InvaliUserIdOrPwdException extends Exception {

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Enter valid User ID and PWD";
	}
	
	

}

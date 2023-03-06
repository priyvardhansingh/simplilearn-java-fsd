package com.vardhan.email.validation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class EmailValidator {
	//Make method to compare
	private String validateEmailID(String userEmail , List<String> validEmailList ) {
		String status;
		
		for(int index = 0; index < validEmailList.size(); index++) {
		
			if(validEmailList.get(index).equals(userEmail)) {
				status = userEmail + " is valid";
				return status;
			}
			}
		
	status =userEmail + "is not valid";
		return status; 
	}

	public static void main(String[] args) {
		
		//2nd we create scanner where user can input 
		
		Scanner emailBox = new Scanner(System.in);
		String fillEmail = emailBox.next();
		
		System.out.println("Please enter UserID:::" + fillEmail);
		
		
		// TODO Auto-generated method stub

		//First Create array list in main class
	List<String> emailId = new ArrayList<>();
	emailId.add("priyvardhan@gmail.com");
	emailId.add("vardhan@gmail.com");
	emailId.add("utkarsha@gmail.com");
	emailId.add("gillu@gmail.com");
	
	System.out.println("Email Id List::" + emailId );
	EmailValidator emailValidator = new EmailValidator();
	
	String emailValidationStatus = emailValidator.validateEmailID(fillEmail ,emailId);
	System.out.println(emailValidationStatus);
	}

}

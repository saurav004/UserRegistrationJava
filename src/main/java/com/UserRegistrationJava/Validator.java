package com.UserRegistrationJava;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {
	static String patternFirstAndLastName = "^[A-Z]{1}[a-zA-Z]{2,30}$";
	static String patternEmailId = "^[a-zA-Z][a-zA-Z0-9_\\-+]*[.]{0,1}[a-zA-Z0-9_\\-+]{1,}[@][a-zA-Z0-9]{1,}[.][a-zA-Z]{2,}[.]{0,}[a-zA-Z]*$";
	static String patternPhoneNumber = "^[+]{1}[0-9]{2}[ ][0-9]{10}";
	static String patternPassword1 = "^[a-zA-Z0-9]{8,}$";
	static String patternPassword2 = "^(?=.*[A-Z]).{8,}$";
	static String patternPassword3 = "^(?=.*[A-Z])(?=.*?[0-9]).{8,}$";
	static String patternPassword4 = "^(?=.*?[A-Z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,}$";
	static boolean isTesting;
	// valid email Ids
	public static final String[] validEmailIds = new String[] { "abc@yahoo.com", "abc-100@yahoo.com",
			"abc.100@yahoo.com", "abc111@abc.com", "abc-100@abc.net", "abc.100@abc.com.au", "abc@1.com",
			"abc@gmail.com.com", "abc+100@gmail.com" };
	// invalid email Ids

	public static final String[] inValidEmailIds = new String[] { "abc@.com.my", "abc123@gmail.a", "abc123@.com",
			"abc123@.com.com", ".abc@abc.com", "abc()*@gmail.com", "abc..2002@gmail.com", "abc.@gmail.com",
			"abc@abc@gmail.com", "abc@gmail.com.1a", "abc@gmail.com.aa.au" };

	static Scanner scan = new Scanner(System.in);

	public boolean validatefirstName(Person person, String firstNameTest) {
		String firstName = null;
		while (true) {
			if (isTesting)
				firstName = firstNameTest;
			else {
				System.out.println("\n\tEnter your First Name");
				firstName = scan.nextLine();
			}
			System.out.println("First Name :" + firstName);
			Pattern pattern = Pattern.compile(patternFirstAndLastName);
			Matcher Match = pattern.matcher(firstName);
			if (Match.matches()) {
				person.setFirstName(firstName);
				System.out.println("First Name Validated");
				return true;
			} else
				System.out.println("Invalid first Name!!!");
			if (isTesting) {
				break;
			}
		}
		return false;
	}

	public boolean validatelastName(Person person, String lastNameTest) {
		String lastName = null;
		while (true) {
			if (isTesting)
				lastName = lastNameTest;
			else {
				System.out.println("\n\tEnter your Last Name");
				lastName = scan.nextLine();
			}
			System.out.println("Last Name :" + lastName);
			Pattern pattern = Pattern.compile(patternFirstAndLastName);
			Matcher Match = pattern.matcher(lastName);
			if (Match.matches()) {
				person.setFirstName(lastName);
				System.out.println("Last Name Validated");
				return true;
			} else
				System.out.println("Invalid Last Name!!!");
			if (isTesting) {
				break;
			}
		}
		return false;
	}

	public boolean validateEmailId(Person person, String emailIdTest) {
		String emailId = null;
		while (true) {
			if (isTesting)
				emailId = emailIdTest;
			else {
				System.out.println("\n\tEnter your Email id");
				emailId = scan.nextLine();
			}
			System.out.println("Email id :" + emailId);
			Pattern pattern = Pattern.compile(patternEmailId);
			Matcher Match = pattern.matcher(emailId);
			if (Match.matches()) {
				person.setEmailId(emailId);
				System.out.println("EmailID Validated");
				return true;
			} else {
				System.out.println("Invalid Email ID!!!");
				if (isTesting) {
					return false;
				}
			}
		}
	}

	public boolean validatePhoneNumber(Person person, String phoneNumberTest) {
		String phoneNumber = null;
		while (true) {
			if (isTesting)
				phoneNumber = phoneNumberTest;
			else {
				System.out.println("\n\tEnter your Phone Number");
				phoneNumber = scan.nextLine();
			}
			System.out.println("Phone Number :" + phoneNumber);
			Pattern pattern = Pattern.compile(patternPhoneNumber);
			Matcher Match = pattern.matcher(phoneNumber);
			if (Match.matches()) {
				person.setPhoneNumber(phoneNumber);
				System.out.println("Phone Number Validated");
				return true;
			} else
				System.out.println("Invalid Phone Number!!!");
			if (isTesting) {
				break;
			}
		}
		return false;
	}

	public boolean validatePassword(Person person, String Password) {
		String password = null;
		while (true) {
			if (isTesting)
				password = Password;
			else {
				System.out.println("\n\tEnter your password");
				password = scan.nextLine();
			}
			System.out.println("Password :" + password);
			Pattern pattern = Pattern.compile(patternPassword4);
			Matcher Match = pattern.matcher(password);
			if (Match.matches()) {
				person.setPassword(password);
				System.out.println("password Validated");
				return true;
			} else {
				System.out.println("Invalid password!!!");
			}
			if (isTesting) {
				break;
			}
		}
		return false;
	}

//	public boolean validateAllEmail(String[] emailStack) {
//		System.out.println("hi");
//		String email = null;
//		System.out.println(emailStack.length);
//		for (int i = 0; i < emailStack.length; i++) {
//			email = emailStack[i];
//			Pattern pattern = Pattern.compile(patternEmailId);
//			Matcher Match = pattern.matcher(email);
//			if (Match.matches()) {
//				System.out.println(email + " : email Validated");
//			} else {
//				System.out.println(email + " : Invalid email IDs!!!");
//			}
//		}
//
//		return false;
//	}
}

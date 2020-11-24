package com.UserRegistrationJava;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {
	static String patternFirstAndLastName = "^[A-Z]{1}[a-zA-Z]{2,30}$";
	static String patternEmailId = "^[a-zA-Z][a-zA-Z0-9_\\-+]*[.]{0,1}[a-zA-Z0-9_\\-+]{1,}[@][a-zA-Z0-9]{1,}[.][a-zA-Z]{2,}[.]{0,}[a-zA-Z]*$";
	static Scanner scan = new Scanner(System.in);

	public void validatefirstName(Person person) {
		String firstName = null;
		while (true) {
			System.out.println("\n\tEnter your First Name");
			firstName = scan.nextLine();
			System.out.println("First Name :" + firstName);
			Pattern pattern = Pattern.compile(patternFirstAndLastName);
			Matcher Match = pattern.matcher(firstName);
			if (Match.matches()) {
				person.setFirstName(firstName);
				System.out.println("First Name Validated");
				break;

			} else
				System.out.println("Invalid first Name!!!");
		}
	}

	public void validatelastName(Person person) {
		String lastName = null;
		while (true) {
			System.out.println("\n\tEnter your Last Name");
			lastName = scan.nextLine();
			System.out.println("Last Name :" + lastName);
			Pattern pattern = Pattern.compile(patternFirstAndLastName);
			Matcher Match = pattern.matcher(lastName);
			if (Match.matches()) {
				person.setFirstName(lastName);
				System.out.println("Last Name Validated");
				break;
			} else
				System.out.println("Invalid Last Name!!!");
		}
	}

	public void validateEmailId(Person person) {
		String emailId = null;
		while (true) {
			System.out.println("\n\tEnter your Email id");
			emailId = scan.nextLine();
			System.out.println("Email id :" + emailId);
			Pattern pattern = Pattern.compile(patternEmailId);
			Matcher Match = pattern.matcher(emailId);
			if (Match.matches()) {
				person.setEmailId(emailId);
				System.out.println("EmailID Validated");
				break;
			} else
				System.out.println("Invalid Email ID!!!");
		}
	}

}

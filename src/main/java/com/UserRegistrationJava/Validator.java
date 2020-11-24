package com.UserRegistrationJava;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {
	static String patternFirstAndLastName = "^[A-Z]{1}[a-z]{2,30}$";
	static Scanner scan = new Scanner(System.in);

	public  void validatefirstName(Person person) {
		String firstName = null;
		while (true) {
			System.out.println("\n\tEnter your First Name");
			firstName = scan.nextLine();
			System.out.println(firstName);
			Pattern pattern = Pattern.compile(patternFirstAndLastName);
			Matcher Match = pattern.matcher(firstName);
			if (Match.matches()) {
				person.setFirstName(firstName);
				System.out.println("First Name Validated");
				break;

			}
			else
				System.out.println("Invalid first Name!!!");
		}
	}
	
	public  void validatelastName(Person person) {
		String lastName = null;
		while (true) {
			System.out.println("\n\tEnter your Last Name");
			lastName = scan.nextLine();
			System.out.println(lastName);
			Pattern pattern = Pattern.compile(patternFirstAndLastName);
			Matcher Match = pattern.matcher(lastName);
			if (Match.matches()) {
				person.setFirstName(lastName);
				System.out.println("Last Name Validated");
				break;
			}
			else
				System.out.println("Invalid Last Name!!!");
		}
	}

}

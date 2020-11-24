package com.UserRegistrationJava;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {
	static String patternFirstName = "^[A-Z]{1}[a-z]{2,30}$";
	static Scanner scan = new Scanner(System.in);

	public static void validatefirstName(Person person) {
		String firstName = null;
		while (true) {
			System.out.println("\n\tEnter your First Name");
			firstName = scan.nextLine();
			System.out.println(firstName);
			Pattern pattern = Pattern.compile(patternFirstName);
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

}
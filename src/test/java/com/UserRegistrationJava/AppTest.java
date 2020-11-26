package com.UserRegistrationJava;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple Application.
 */
public class AppTest {
	/**
	 * Rigorous Test :-)
	 */
	Person personTest = new Person();

	@Test
	public void validatePassword() throws InvalidException{
		Validator validate = new Validator();
		Validator.isTesting = true;
		// happy
		boolean isValid = validate.validatePassword(personTest, "@Saurav0");
		assertTrue(isValid);
		// sad
		isValid = validate.validatePassword(personTest, "Saurav");
		assertTrue(isValid);
		Validator.isTesting = false;
	}

	@Test
	public void validatefirstName() throws InvalidException {
		Validator validate = new Validator();
		Validator.isTesting = true;
		// happy
		boolean isValid = validate.validatefirstName(personTest, "Saurav");
		assertTrue(isValid);
		// sad
		isValid = validate.validatefirstName(personTest, "saurav");
		assertTrue(isValid);
		Validator.isTesting = false;
	}

	@Test
	public void validatelastName() throws InvalidException{
		Validator validate = new Validator();
		Validator.isTesting = true;
		// happy
		boolean isValid = validate.validatelastName(personTest, "Sharma");
		assertTrue(isValid);
		// sad
		isValid = validate.validatelastName(personTest, "sharma");
		assertTrue(isValid);
		Validator.isTesting = false;
	}

	@Test
	public void validateEmailId() throws InvalidException{
		Validator validate = new Validator();
		Validator.isTesting = true;
		// happy
		boolean isValid = validate.validateEmailId(personTest, "logtosaurav@gmail.com");
		assertTrue(isValid);
		// sad
		isValid = validate.validateEmailId(personTest, "abc123@.com.com");
		assertTrue(isValid);
		Validator.isTesting = false;
	}

	@Test
	public void validatePhoneNumber() throws InvalidException {
		Validator validate = new Validator();
		Validator.isTesting = true;
		// happy
		boolean isValid = validate.validatePhoneNumber(personTest, "+91 9284543205");
		assertTrue(isValid);
		// sad
		isValid = validate.validatePhoneNumber(personTest, "+91 928454320");
		assertTrue(isValid);
		Validator.isTesting = false;
	}

	@Test
	public void validateMultipleEmails() throws InvalidException {
		Validator validate = new Validator();
		Validator.isTesting = true;
		// valid email Ids
		final String[] validEmailIds = new String[] { "abc@yahoo.com", "abc-100@yahoo.com", "abc.100@yahoo.com",
				"abc111@abc.com", "abc-100@abc.net", "abc.100@abc.com.au", "abc@1.com", "abc@gmail.com.com",
				"abc+100@gmail.com" };
		// happy
		for (int j = 0; j < validEmailIds.length; j++) {
			boolean isValid = validate.validateEmailId(personTest,validEmailIds[j]);
			assertTrue(isValid);
		}
		// invalid email Ids
				final String[] inValidEmailIds = new String[] { "abc@.com.my", "abc123@gmail.a", "abc123@.com",
						"abc123@.com.com", ".abc@abc.com", "abc()*@gmail.com", "abc..2002@gmail.com", "abc.@gmail.com",
						"abc@abc@gmail.com", "abc@gmail.com.1a", "abc@gmail.com.aa.au" };
		// sad
				for (int j = 0; j < inValidEmailIds.length; j++) {
					boolean isValid = validate.validateEmailId(personTest,inValidEmailIds[j]);
						assertFalse(isValid);
				}
		Validator.isTesting = false;
	}

}

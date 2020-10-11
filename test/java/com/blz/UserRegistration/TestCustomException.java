package com.blz.UserRegistration;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

public class TestCustomException {

	@Test
	public void givenInvalidFirstName() throws InvalidUserDetailsException {
		UserRegistration ur = new UserRegistration();
		boolean firstName = ur.checkFirstName("De");
		Assert.assertEquals(false, firstName);
	}

	@Test
	public void givenInvalidLastName() throws InvalidUserDetailsException {
		UserRegistration ur = new UserRegistration();
		boolean lastName = ur.checkFirstName("De");
		Assert.assertEquals(false, lastName);
	}

	@Test
	public void givenInvalidEmail() throws InvalidUserDetailsException {
		UserRegistration ur = new UserRegistration();
		boolean email = ur.checkEmail("ab@bl.co");
		Assert.assertEquals(false, email);
	}

	@Test
	public void givenInvalidMobile() throws InvalidUserDetailsException {
		UserRegistration ur = new UserRegistration();
		boolean mobile = ur.checkPhoneNumber("918888888888");
		Assert.assertEquals(false, mobile);
	}

	@Test
	public void givenInvalidCheckEmail() throws InvalidUserDetailsException {
		UserRegistration ur = new UserRegistration();
		boolean password = ur.checkPassword("ju@1");
		Assert.assertEquals(false, password);
	}

}

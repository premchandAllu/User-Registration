package com.blz.UserRegistration;

import static org.junit.Assert.assertEquals;

import org.junit.*;

public class UserRegistrationTest {

	@Test
	public void HappyTest() {
		UserRegistration ur = new UserRegistration();
		boolean firstName = ur.checkFirstName("Deeksha");
		assertEquals(true, firstName);
		boolean lastName = ur.checkLastName("Sai");
		assertEquals(true, lastName);
		boolean email = ur.checkEmail("abc.xyz@bl.co.in");
		assertEquals(true, email);
		boolean mobile = ur.checkMobile("91 8888888888");
		assertEquals(true, mobile);
		boolean password = ur.checkPassword("jhsvYTu@1");
		assertEquals(true, password);
	}

	@Test
	public void SadTest() {
		UserRegistration ur = new UserRegistration();
		boolean firstName = ur.checkFirstName("De");
		assertEquals(false, firstName);
		boolean lastName = ur.checkLastName("Sa");
		assertEquals(false, lastName);
		boolean email = ur.checkEmail("ab@bl.co");
		assertEquals(false, email);
		boolean mobile = ur.checkMobile("918888888888");
		assertEquals(false, mobile);
		boolean password = ur.checkPassword("ju@1");
		assertEquals(false, password);
}
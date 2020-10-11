package com.blz.UserRegistration;

import static org.junit.Assert.assertEquals;

import org.junit.*;

public class UserRegistrationTest {

	@Test
	public void HappyTest() {
		UserRegistration ur = new UserRegistration();
		
		boolean firstName = ur.checkFirstName("Prem");
		assertEquals(true, firstName);
		boolean lastName = ur.checkLastName("Chand");
		assertEquals(true, lastName);
		boolean email = ur.checkEmail("abc.xyz@bl.co.in");
		assertEquals(true, email);
		boolean mobile = ur.checkPhoneNumber("91 7660078866");
		assertEquals(true, mobile);
		boolean password = ur.checkPassword("Dbxivxi@1");
		assertEquals(true, password);
	}

	@Test
	public void SadTest() {
		UserRegistration ur = new UserRegistration();
		boolean firstName = ur.checkFirstName("pc");
		assertEquals(false, firstName);
		boolean lastName = ur.checkLastName("Ap");
		assertEquals(false, lastName);
		boolean email = ur.checkEmail("ab@bl.co");
		assertEquals(false, email);
		boolean mobile = ur.checkPhoneNumber("917660078866");
		assertEquals(false, mobile);
		boolean password = ur.checkPassword("dub@1");
		assertEquals(false, password);
	}
}